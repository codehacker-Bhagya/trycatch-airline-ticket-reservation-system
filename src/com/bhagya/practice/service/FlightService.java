package com.bhagya.practice.service;

import com.bhagya.practice.model.Flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FlightService {

    private Map<Integer, Flight> flights = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    int flightIndex = 0;


    public static void flightData(Flight flight) {
        System.out.println(flight);

    }

    public Flight FlightInformation() {

      //  try {
            int option = 0;

            Flight flight = new Flight();


            System.out.println("Enter Your Destination");
            String destination = scanner.nextLine();
            System.out.println("Enter Your Flight Name which flight ticket do you need");
            String flightName = scanner.nextLine();
            System.out.println("Your Flight No Is : 5231");
            System.out.println("Flight Status: Ticket Is Available You Can book Your Ticket");

            flight.setDestination(destination);
            flight.setFlightName(flightName);

     //   }catch (Exception e){
          //  System.out.println("");
      //  }

        return flight;
    }

    public void displayFlight() {
        Set<Map.Entry<Integer, Flight>> entrySet = flights.entrySet();
        for (Map.Entry<Integer, Flight> flightEntry : entrySet) {
            System.out.println("Key: " + flightEntry.getKey() + "| Value: " + flightEntry.getValue());
        }


    }
}