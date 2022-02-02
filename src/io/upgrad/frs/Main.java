package io.upgrad.frs;

public class Main {

	public static void main(String[] args) {
		
	Flight flight = new Flight("Air007" , "Airasia" , 150 , 145);
                
        System.out.println("\nFlight Details");
        System.out.println("Airline: " +flight.getAirline());
        System.out.println("Flight Number: " + flight.getFlightNumber());
        
	}

}
