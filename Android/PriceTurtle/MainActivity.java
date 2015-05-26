package com.priceturtle;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends Activity {

    // Instance of RetailPickerFragment
    // used to execute onClick of Find_Giftcards button
    RetailerPickerFragment retailerPickerFragmentInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retailerPickerFragmentInstance = new RetailerPickerFragment();

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, retailerPickerFragmentInstance)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClickFindGiftCardsButton(View v){
        retailerPickerFragmentInstance.launchGiftCardListActivity(v);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class RetailerPickerFragment extends Fragment implements AdapterView.OnItemSelectedListener {

        // String to store the name of the retail store
        // selected by the user in the spinner
        String selectedItemText;

        public RetailerPickerFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

            // Get the list spinner for the retail items
            Spinner retailStoreSpinner = (Spinner)getActivity().findViewById(R.id.spinner_retailer_list);

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                    R.array.retailer_names_array_resource, android.R.layout.simple_spinner_item);

            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Apply the adapter to the spinner
            retailStoreSpinner.setAdapter(adapter);

            // Set the current instance to the the listener for the spinner
            retailStoreSpinner.setOnItemSelectedListener(this);
        }

        public void launchGiftCardListActivity(View v){
            Intent intent = new Intent(getActivity(),DisplayGiftCardsActivity.class);
            intent.putExtra(ListOfURLs.STORE_NAME,selectedItemText);
            startActivity(intent);
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            selectedItemText = parent.getSelectedItem().toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
