package io.upgrad.frs;

public class RegularTicket {


    private String pnr;
    private String departure;
    private String destination;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private String specialServices;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public RegularTicket(String pnr, String departure, String destination,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled,Flight flight,Passenger passenger) {
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;             
        this.passenger = passenger;
        this.specialServices = null;
    }
    public String CheckStatus() {
        
        return null;
    }
    public int getFlightDuration() {
        
        return 0;
    }
    public void cancelTicket() {
        
    }
    public String getSpecialServices() {
        
        return null;
    }
    public void updateSpecialServices(String service) {
        
    }
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public String getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isCancelled() {
		return cancelled;
	}
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void setSpecialServices(String specialServices) {
		this.specialServices = specialServices;
	}

    
    
}