package io.upgrad.frs;

public class RegularTicket {


    public String pnr;
    public String departure;
    public String destination;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public String specialServices;
    public float price;
    public boolean cancelled;

    public RegularTicket(String pnr, String departure, String destination,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
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

}