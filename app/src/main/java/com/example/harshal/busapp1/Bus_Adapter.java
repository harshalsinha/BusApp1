package com.example.harshal.busapp1;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Bus_Adapter extends ArrayAdapter<Bus_Details> {
    private final Activity context;
    private ArrayList<Bus_Details> buses;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    public ImageLoader imageLoader;

    /*public Bus_Adapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(activity.getApplicationContext());
    }*/
    public Bus_Adapter(Activity context,ArrayList<Bus_Details> buses)
    {
        super(context,R.layout.select_bus_template,buses);

        this.context = context;
        this.buses = buses;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.select_bus_template, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.sub_title);
        TextView timeText = (TextView) rowView.findViewById(R.id.time);

        titleText.setText(buses.get(position).busNumber + " - " + buses.get(position).source + " to " + buses.get(position).destination);
        subtitleText.setText(buses.get(position).source);
        timeText.setText(buses.get(position).departureTime);

        return rowView;

    };


   /* public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.select_bus_template, null);

        TextView title = (TextView)vi.findViewById(R.id.title); // title
        TextView artist = (TextView)vi.findViewById(R.id.artist); // artist name
        TextView duration = (TextView)vi.findViewById(R.id.duration); // duration
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image

        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);

        // Setting all values in listview
        /*title.setText(song.get(Select_bus.KEY_TITLE));
        artist.setText(song.get(CustomizedListView.KEY_ARTIST));
        duration.setText(song.get(CustomizedListView.KEY_DURATION));
        imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
        return vi;
    }*/
}
