package io.upgrad.frs;

public class Main {

	public static void main(String[] args) {
		
		Flight flight = new Flight("Air007", "Airasia", 150, 135);
        Passenger passanger = new Passenger("Ganesh", "7032606060", "gani@gmail.com", "vishaka", "gajuwaka", "Andhrapradesh");
        RegularTicket regularTicket = new RegularTicket("5051","rajivgandhi", "delhi","2022-02-01T12:12:00","2022-02-01T16:56:00", "C14",18500.00f, true);
        TouristTicket touristTicket = new TouristTicket("1505","rajivgandhi", "mumbai","2022-02-02T18:18:00","2022-02-02T22:10:00","B14","Hotel Taj, Mumbai", 22366.00f, true); 

        System.out.println("\nFlight Details");
        System.out.println(flight.getFlightDetails());

        System.out.println("\nPassanger details");
        System.out.println(passanger.name);
        System.out.println(passanger.phone);
        System.out.println(passanger.email);

        System.out.println("\n RegularTicket details");
        System.out.println("pnr : " + regularTicket.pnr +"\nseatNo : " + regularTicket.seatNo);

        System.out.println("\n\nTouristTicket details");
        System.out.printf(" PNR: %s \n Seat Number: %s \n Departure: %s \n Destination: %s \n Departure DateTime: %s ",
                touristTicket.pnr,
                touristTicket.seatNo,
                touristTicket.departure,
                touristTicket.destination,
                touristTicket.departureDateTime);
	}

}
