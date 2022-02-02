package io.upgrad.frs;

public class Flight {
	
	private  String flightNumber;
	private  String airline;
	private  int capacity;
	private  int bookedSeats;
	
	
	
	
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

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBookedSeats() {
		return bookedSeats;
		
	}
	
	
}
 	