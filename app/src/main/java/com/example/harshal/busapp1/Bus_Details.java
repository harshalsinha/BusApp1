package com.example.harshal.busapp1;


import java.io.Serializable;

public class Bus_Details implements Serializable{

    String source;
    String destination;
    String busNumber;
    String departureTime;

    public Bus_Details(String source,String destination,String departureTime,String busNumber)
    {
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.busNumber = busNumber;
    }


}
