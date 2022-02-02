package io.upgrad.frs;

public class TouristTicket {

	 public String pnr, departure, destination, departureDateTime, arrivalDateTime, seatNo;
	    public String hotelAddress;
	    public String[] selectedTouristLocation;
	    public float price;
	    public boolean cancelled;

	    public TouristTicket(String pnr, String departure, String destination, 
	    		String departureDateTime, String arrivalDateTime, String seatNo, 
	    		 String hotelAddress, float price, boolean cancelled) {
	        this.pnr = pnr;
	        this.departure = departure;
	        this.destination = destination;
	        this.departureDateTime = departureDateTime;
	        this.arrivalDateTime = arrivalDateTime;
	        this.seatNo = seatNo;
	        this.hotelAddress = hotelAddress;
	        this.price = price;
	        this.cancelled = cancelled;
	        this.selectedTouristLocation = new String[5];
	    }

	    public String CheckStatus() {

	        return null;
	    }
	    public int getFlightDuration() {
	        
	        return 0;
	    }
	    public void cancelTicket() {

	    }
	    public String getHotelAddress() {

	        return null;
	    }
	    public String[] getTouristLocation() {

	        return null;
	    }

	    public void addTouristLocation(String location) {

	    }
	    
	    public void removeTouristLocation(String locaion) {
	        
	    }

}
