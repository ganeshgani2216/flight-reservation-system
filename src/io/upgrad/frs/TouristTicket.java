package io.upgrad.frs;

public class TouristTicket extends Ticket {
			
		private String hotelAddress;
		private List<String> selectedTouristLocation;
		
	    public TouristTicket(String pnr, String departure, String destination, 
	    		String departureDateTime, String arrivalDateTime, String seatNo, 
	    		 String hotelAddress, float price, boolean cancelled ,Flight flight,Passenger passenger) {
	       
	    	super(pnr,departure, destination, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
	        this.hotelAddress = hotelAddress;  
	    	
	        this.selectedTouristLocation = new ArrayList<>();
	    }

	  
	   
	