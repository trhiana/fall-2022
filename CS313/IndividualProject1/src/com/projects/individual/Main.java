package com.projects.individual;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author trhiana
 */
public class Main {
    /**
     * Instance variables.
     */
    private String startCity, destinationCity, airline;
    private int flights, stops;
    private ArrayList<String> routes, airports, allAirlines;

    /**
     * Constructor: building an object of the Flight class
     * @param startCity
     * @param destinationCity
     * @param airline
     * @param flights
     * @param stops
     */
    public Main(String startCity, String destinationCity, String airline, int flights, int stops) {
        this.startCity = startCity;
        this.destinationCity = destinationCity;
        this.airline = airline;
        this.flights = flights;
        this.stops = stops;
    }

    /**
     * Accessor method for start city
     * @return
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * Setter for start city
     * @param startCity
     */
    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    /**
     * Accessor method for destination city
     * @return
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Setter for destination city
     * @param destinationCity
     */
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    /**
     * Accessor method for airline
     * @return
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Setter for airline
     * @param airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * Accessor method for flights
     * @return
     */
    public int getFlights() {
        return flights;
    }

    /**
     * Setter for flights
     * @param flights
     */
    public void setFlights(int flights) {
        this.flights = flights;
    }

    /**
     * Accessor method for stops
     * @return
     */
    public int getStops() {
        return stops;
    }

    /**
     * Setter for stops
     * @param stops
     */
    public void setStops(int stops) {
        this.stops = stops;
    }

    /**
     * Accessor method for routes
     * @return
     */
    public ArrayList<String> getRoutes() {
        return routes;
    }

    /**
     * Setter for routes
     * @param routes
     */
    public void setRoutes(ArrayList<String> routes) {
        this.routes = routes;
    }

    /**
     * Accessor method for airports
     * @return
     */
    public ArrayList<String> getAirports() {
        return airports;
    }

    /**
     * Setter for airports
     * @param airports
     */
    public void setAirports(ArrayList<String> airports) {
        this.airports = airports;
    }

    /**
     * Accessor method for all airlines
     * @return
     */
    public ArrayList<String> getAllAirlines() {
        return allAirlines;
    }

    /**
     * Setter for all airlines
     * @param allAirlines
     */
    public void setAllAirlines(ArrayList<String> allAirlines) {
        this.allAirlines = allAirlines;
    }

    /**
     * Hash code method.
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + startCity.length();
        hash = 31 * hash + (airline == null ? 0 : airline.hashCode());
        hash = (int) (31 * hash + (flights == 0 ? 0 : flights));
        return hash;
    }

    /**
     * Read what's in the input file.
     * It returns a list of the data in the input file
     * @return info
     */
    public static ArrayList<String[]> readFile() {
        ArrayList<String[]> info = new ArrayList<String[]>();
        try {
            Scanner scanner = new Scanner(new File("travel_input.txt"));
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                info.add(data);
            }
            if (info.size() == 0) {
                System.out.println("File is empty!");
            }
            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist.");
        }
        return info;
    }

    /**
     * Read the data from the airports.csv file
     *
     * @return airports
     */
    public HashMap<ArrayList<String>, String> airportFile() {
        HashMap<ArrayList<String>, String> airports = new HashMap<ArrayList<String>, String> ();
        try {
            Scanner scanner = new Scanner(new FileReader("airports.csv"));
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                ArrayList location = new ArrayList<>();
                location.add(data[2]); // city
                location.add(data[3]); // country
                airports.put(location, data[4]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
        return airports;
    }

    /**
     * Getting the airport code from the departure airport
     * @return airportCode
     */
    public String departureAirportCode() {
        HashMap<ArrayList<String>, String> airport = airportFile();
        String airportCode = "";
        ArrayList<String[]> departureAirport = readFile();
        ArrayList<String> location = new ArrayList<String>();

        try{
            location.add(departureAirport.get(0)[0]);
            location.add(departureAirport.get(0)[1]);
            if (airport.containsKey(location)) {
                airportCode = airports.get(location);
            } else {
                System.out.println("The location you've provided is not in our files.");
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("The file is empty.");
        }
        return airportCode;
    }

    /**
     * Getting the airport code for the arrival airport
     * @return airportCode
     */
    public String arrivalAirportCode() {
        HashMap<ArrayList<String>, String> airport = airportFile();
        String airportCode = "";
        ArrayList<String[]> departureAirport = readFile();
        ArrayList<String> location = new ArrayList<String>();

        try{
            location.add(departureAirport.get(1)[0]);
            location.add(departureAirport.get(1)[1]);

            if (airport.containsKey(location)) {
                airportCode = airports.get(location);
            } else {
                System.out.println("The location you've provided is not in our files.");
            }
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("The file is empty.");
        }

        return airportCode;
    }

    /**
     * Get user input and save to the input file
     */
    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        String departure, arrival;
        System.out.println("Enter departure location (Accra, Ghana): ");
        departure = scanner.nextLine();

        System.out.println("Enter arrival location (Kampala, Uganda): ");
        arrival = scanner.nextLine();

        try {
            PrintWriter printWriter = new PrintWriter("travel_input.txt");
            printWriter.write(departure + "\n"+arrival);
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("There is no file labeled 'travel_input.txt'");
        }
    }

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {}
}
