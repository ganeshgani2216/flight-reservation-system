package io.upgrad.frs;

public class RegularTicket extends Ticket{

	private String specialServices;
    
    public RegularTicket(String pnr, String departure, String destination,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled,Flight flight,Passenger passenger) {
        
    	
    	super(pnr,departure, destination, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.specialServices = null;
    }
    
    public String getSpecialServices() {
    		return this.specialServices;
	}
        
	public void updateSpecialServices(String services) {
		this.setSpecialServices(services);
	}
	
	 public void setSpecialServices(String specialServices) {
	        this.specialServices = specialServices;
	    }    
   }