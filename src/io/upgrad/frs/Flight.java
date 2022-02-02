package io.upgrad .frs;hisnt

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
		return "flightNumber: " + flightNumber +
			   ", airline: " + airline +
			   ", seatingCapacity: " + seatingCapacity +
			   ", bookedSeats: " + bookedSeats;
	}
	
	public boolean checkavailability() {
		return this.getBookedSeats() == this.getSeatingCapacity() ? false : true;
	}
	
	public void incrementBookingCounter() {
		this.setBookedSeats(this.getBookedSeats() + 1);
		
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

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingcapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getBookedSeats() {
		return bookedSeats;		
	}
	public void setBookedSeats(int bookedSeats) {
	
		this.bookedSeats = bookedSeats;
}
 	