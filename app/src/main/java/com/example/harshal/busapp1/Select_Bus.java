package com.example.harshal.busapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Select_Bus extends AppCompatActivity {

    ListView list;
    ArrayList<Bus_Details> buses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__bus);

        buses = new ArrayList<Bus_Details>();
        Bus_Details bus_details1 = new Bus_Details("RANCHI","GAYA","21:30","BUS:001");
        buses.add(bus_details1);
        Bus_Details bus_details2 = new Bus_Details("RANCHI","DHANBAD","20:30","BUS:002");
        buses.add(bus_details2);
        Bus_Details bus_details3 = new Bus_Details("RANCHI","RAMGARH","19:30","BUS:003");
        buses.add(bus_details3);
        Bus_Details bus_details4 = new Bus_Details("RANCHI","JAMSHEDPUR","11:30","BUS:004");
        buses.add(bus_details4);
        Bus_Details bus_details5 = new Bus_Details("RANCHI","HAZARIBAGH","8:30","BUS:005");
        buses.add(bus_details5);
        Bus_Details bus_details6 = new Bus_Details("RANCHI","PATNA","1:30","BUS:006");
        buses.add(bus_details6);
        Bus_Details bus_details7 = new Bus_Details("RANCHI","GAYA","21:30","BUS:001");
        buses.add(bus_details7);
        Bus_Details bus_details8 = new Bus_Details("RANCHI","DHANBAD","20:30","BUS:002");
        buses.add(bus_details8);
        Bus_Details bus_details9 = new Bus_Details("RANCHI","RAMGARH","19:30","BUS:003");
        buses.add(bus_details9);
        Bus_Details bus_details10 = new Bus_Details("RANCHI","JAMSHEDPUR","11:30","BUS:004");
        buses.add(bus_details10);
        Bus_Details bus_details11 = new Bus_Details("RANCHI","HAZARIBAGH","8:30","BUS:005");
        buses.add(bus_details11);
        Bus_Details bus_details12 = new Bus_Details("RANCHI","PATNA","1:30","BUS:006");
        buses.add(bus_details12);

        Bus_Adapter adapter=new Bus_Adapter(this, buses);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Intent intent = new Intent(view.getContext(),Customer_Booking_Details.class);
               Bus_Details selectedBus = buses.get(position);
               intent.putExtra("SelectedBus",selectedBus);
               startActivity(intent);
            }
        });

    }
}
