package io.upgrad.frs;

public class Main {

	public static void main(String[] args) {
		
	Flight flight1 = new Flight("Air007" , "Airasia" , 150 , 145);
	Flight flight2 = new Flight("Air010" , "Airasia" , 150 , 125);            
      
	Passenger passenger1 = new Passenger("Ganesh", "7032606060", "gani@gmail.com", "vishaka", "gajuwaka", "Andhrapradesh");
	Passenger passenger2 = new Passenger("vignesh", "7032060606", "vignesh2216@gmail.com","secunderabad", "hyderabad", "Telangana");
	
	RegularTicket regularTicket = new RegularTicket("5051","rajivgandhi", "delhi","2022-02-01 12:00","2022-02-01 16:00","C14",18500.00f, true,flight1, passenger1);
	TouristTicket touristTicket = new TouristTicket("1505","rajivgandhi", "mumbai","2022-02-02 18:00","2022-02-02 21:00","B14","Hotel Taj, Mumbai", 22366.00f, true,flight2, passenger2);
	
	 printTicketDetails(regularTicket);
     printTicketDetails (touristTicket);

	}
	public static void printTicketDetails (Ticket ticket){
     System.out.println(ticket.getPnr());
    }
 }

