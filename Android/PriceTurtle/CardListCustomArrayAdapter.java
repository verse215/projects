package com.priceturtle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Setup list view adapter to show values nicely
 * Created by verse on 12/2/14.
 */
public class CardListCustomArrayAdapter extends ArrayAdapter<GiftCard> {

    Context context;
    ArrayList<GiftCard> giftCardArrayList;

    public CardListCustomArrayAdapter(Context context, ArrayList<GiftCard> giftCardArrayList) {
        super(context,R.layout.card_list_item_layout, giftCardArrayList);

        this.context = context;
        this.giftCardArrayList = giftCardArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View cardListRowVIew = inflater.inflate(R.layout.card_list_item_layout,parent,false);
        TextView retailerNameColumn = (TextView) cardListRowVIew.findViewById(R.id.text_view_retailer_id);
        TextView priceColumn = (TextView) cardListRowVIew.findViewById(R.id.text_view_price_id);
        TextView savingsColumn = (TextView) cardListRowVIew.findViewById(R.id.text_view_savings_id);

        retailerNameColumn.setText(giftCardArrayList.get(position).retailer);
        priceColumn.setText(giftCardArrayList.get(position).price);
        savingsColumn.setText(giftCardArrayList.get(position).savings);

        return cardListRowVIew;
    }
}
