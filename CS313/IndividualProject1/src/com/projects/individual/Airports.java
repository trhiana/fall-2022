package com.projects.individual;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Airports {
    String city, country, airportCode;

    /**
     * syntax from https://www.w3schools.com/java/java_hashmap.asp
     * Stores the list of airports with their AITA codes
     */
    static HashMap<String, Airports> airports = new HashMap<String, Airports>();

    /**
     * @param city
     * @param country
     * @param airportCode
     */
    public Airports(String city, String country, String airportCode) {
        this.city = city;
        this.country = country;
        this.airportCode = airportCode;
    }

    /**
     * Getting the airport code, city, and country from airports.csv
     */
    public static void inputFile() {
        try {
            Scanner scanner = new Scanner(new FileReader("airports.csv"));
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                Airports airports_ = new Airports(data[2], data[3], data[4]);
                airports.put(data[2], airports_);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist.");
        }
    }

    /**
     * Get the city and country of a specific airport using the airport code.
     * @param airportCode
     * @return location
     */
    public static String[] location(String airportCode) {
        String[] loc = new String[2];
        if (airports.containsKey(airportCode)) {
            loc[0] = airports.get(airportCode).city;
            loc[1] = airports.get(airportCode).country;
        }
        return loc;
    }
}
