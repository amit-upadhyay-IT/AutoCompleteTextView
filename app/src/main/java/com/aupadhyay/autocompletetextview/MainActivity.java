package com.aupadhyay.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String STATES[] = new String[]{"Andra Pradesh","Hyderabad","Arunachal Pradesh","Itangar","Assam","Dispur","Bihar","Patna","Chhattisgarh","Raipur","Goa","Panaji","Gujarat","Gandhinagar","Haryana","Chandigarh","Himachal Pradesh","Shimla","Jammu and Kashmir","Srinagar and Jammu","Jharkhand","Ranchi","Karnataka","Bangalore","Kerala","Thiruvananthapuram","Madya Pradesh","Bhopal","Maharashtra","Mumbai","Manipur","Imphal","Meghalaya","Shillong","Mizoram","Aizawi","Nagaland","Kohima","Orissa","Bhubaneshwar","Punjab","Chandigarh","Rajasthan","Jaipur","Sikkim","Gangtok","Tamil Nadu","Chennai","Tripura","Agartala","Uttaranchal","Dehradun","Uttar Pradesh","Lucknow","West Bengal","Kolkata"};
    ArrayAdapter<String> arrayAdapter;

    public void initAutoCompleteTextView()
    {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        arrayAdapter.addAll(STATES);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setOnItemSelectedListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAutoCompleteTextView();
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "You belongs to "+arrayAdapter.getItem(i),Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
