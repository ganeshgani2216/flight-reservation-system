package io.upgrad.frs;

public class TouristTicket extends Ticket {
			
		private String hotelAddress;
		private String[] selectedTouristLocation;
		
	    public TouristTicket(String pnr, String departure, String destination, 
	    		String departureDateTime, String arrivalDateTime, String seatNo, 
	    		 String hotelAddress, float price, boolean cancelled ,Flight flight,Passenger passenger) {
	       
	    	super(pnr,departure, destination, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
	        this.hotelAddress = hotelAddress;  
	    	
	        this.selectedTouristLocation = new String[5];
	    }

	  
	    public String getHotelAddress() {

	        return this.hotelAddress;
	    }
	    public String[] getTouristLocation() {

	        return this.selectedTouristLocation;
	    }

	    public void addTouristLocation(String location) {
	    	
	    	  int length = selectedTouristLocation.length;
	          if(length < 5){
	              this.selectedTouristLocation[length+1] = location;
	    
	          }
	    }   
	    
	    public void removeTouristLocation(String locaion) {
	        
	    	for(int i = 0; i < this.selectedTouristLocation.length; i++){
	            if(this.selectedTouristLocation[i].equalsIgnoreCase(locaion)){
	                this.selectedTouristLocation[i] = null;
	            }
	        }
	    }

		public void setHotelAddress(String hotelAddress) {
			this.hotelAddress = hotelAddress;
		}
	    
		 public void setSelectedTouristLocation(String[] selectedTouristLocation) {
		        this.selectedTouristLocation = selectedTouristLocation;
		    }
				
		}
