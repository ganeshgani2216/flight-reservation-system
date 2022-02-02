package io.upgrad.frs;

public class Flight {
	
	public  String flightNumber;
	public  String airline;
	public  int capacity;
	public  int bookedSeats;
	
	
	
	
	public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.capacity = capacity;
		this.bookedSeats = bookedSeats;
	}

	public String getFlightDetails() {
		return flightNumber;
		
	}
	
	public boolean checkavailability() {
		return true;
	}
	
	public int incrementBookingCounter() {
		return capacity;
		
	}
	
	
}
 	