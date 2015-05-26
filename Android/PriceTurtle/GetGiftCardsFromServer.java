package com.priceturtle;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verse on 11/23/14.
 */
public class GetGiftCardsFromServer  extends AsyncTask<String,Void,Void> {

    // List of gift cards
    static List<GiftCard> listOfGiftCards = new ArrayList<GiftCard>();
    private ProgressDialog taskSpinner;
    String temp;
    Context context;
    ArrayAdapter adapter;

    public GetGiftCardsFromServer(Context context, ArrayAdapter adapter){

        this.context = context;
        this.adapter = adapter;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        // Empty the list
        listOfGiftCards.clear();

        // Setup and show spinner
        taskSpinner = new ProgressDialog(context);
        taskSpinner.setMessage("Finding Gift Cards!");
        taskSpinner.show();
    }

    /**
     * Should probably setup the model data here
     * @param aVoid
     */
    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        if(taskSpinner.isShowing()){
            taskSpinner.dismiss();
        }

        adapter.notifyDataSetChanged();
    }

    @Override
    protected Void doInBackground(String... retailerName) {
        // Get webPage with gift cards
        // Use retailerName String for query
        // http://www.cardpool.com/buy/<retailerName>-gift-cards

        String retailerURL = null;

        if (retailerName[0].compareToIgnoreCase(ListOfURLs.HOMEDEPOT) == 0) {
            retailerURL = ListOfURLs.CARD_POOL_BUY_HOMEDEPOT;
        } else if (retailerName[0].compareToIgnoreCase(ListOfURLs.TARGET) == 0) {
            retailerURL = ListOfURLs.CARD_POOL_BUY_TARGET;
        } else if (retailerName[0].compareToIgnoreCase(ListOfURLs.WALMART) == 0) {
            retailerURL = ListOfURLs.CARD_POOL_BUY_WALMART;
        }

        try {
            Document doc = Jsoup.connect(retailerURL).timeout(10000).get();
            Element cardTable = doc.getElementById("card_list");

            // Card Table may be null, which means there are no longer
            // any cards of this type available.

            if(cardTable == null){
                //do something when no card available
            }
            else {
                Elements a = cardTable.getElementsByAttributeValueContaining("class","card_in_listing");

                for (Element td : a) {
                    Elements temp = td.getAllElements();

                    listOfGiftCards.add(new GiftCard(retailerName[0],
                            temp.get(4).text(), // Value
                            temp.get(5).text(), // Price
                            temp.get(6).text())); // Savings
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch(NullPointerException e){
            e.printStackTrace();
        }

        return null;
    }
}
