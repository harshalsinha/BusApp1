package com.example.harshal.busapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Customer_Booking_Details extends AppCompatActivity {

    ArrayList<String> spinnerItemsAdults;
    ArrayList<String> spinnerItemsChildren;
    Bus_Details busInfo;
    EditText source;
    EditText destination;
    TextView seatsLeft;
    TextView totalFare;
    Spinner spinner_adults;
    Spinner spinner_children;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer__booking__details);

        busInfo = (Bus_Details) getIntent().getSerializableExtra("SelectedBus");

        spinnerItemsAdults = new ArrayList<>();
        spinnerItemsChildren = new ArrayList<>();

        source = (EditText)findViewById(R.id.et_from);
        destination = (EditText)findViewById(R.id.et_to);
        seatsLeft = (TextView)findViewById(R.id.tv_seats_left);
        totalFare = (TextView)findViewById(R.id.tv_total_fare);

        Spinner spinner_adults = (Spinner) findViewById(R.id.spinner_adults);
        Spinner spinner_children = (Spinner) findViewById(R.id.spinner_children);

        source.setText(busInfo.source);
        destination.setText(busInfo.destination);


        spinnerItemsAdults.add("Adults");
        spinnerItemsChildren.add("Children");

        for(int i = 1;i<=10;i++)
        {
            spinnerItemsAdults.add(i + "");
            spinnerItemsChildren.add(i + "");
        }


         //Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerItemsAdults);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_adults.setAdapter(dataAdapter1);


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, spinnerItemsChildren);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_children.setAdapter(dataAdapter2);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinner_adults)
        {
            //do this
        }
        else if(spinner.getId() == R.id.spinner_children)
        {
            //do this
        }

    }

    public void book_clicked(View view) {
        Intent intent = new Intent(this,Seat_Selection.class);
        startActivity(intent);
    }
}
