package io.upgrad.frs;

public class Passenger {

		private int id;
		private static int idCounter;
		
		static {
			idCounter = 0;
		}
	   
		 private static class Contact {
		        private String name, phone, email;

		        public Contact(String name, String phone, String email) {
		            this.name = name;
		            this.phone = phone;
		            this.email = email;
		        }
		        
		        public String getContactDetails() {
		            return this.name + "," + this.phone + "," +this.email;
		        }
		    }

		    private static class Address {
		        private String street, city, state;

		        public Address(String street, String city, String state) {
		            this.street = street;
		            this.city = city;
		            this.state = state;
		        }
		        
		        public String getAddressDetails() {
		            return this.street + "," + this.city + "," +this.state;
		        }
		    }
		    private Address address;
		    private Contact contact;
		    
		    public Passenger(String name, String phone, String email, String street, 
		    		String city, String state) {
		    	 this.id = ++idCounter;
		         this.address = new Address(street, city, state);
		         this.contact = new Contact(name, phone, email);
	    }
		    

		    public String getContact() {
		        return this.contact.getContactDetails();
		    }
		    
		    public String getAddress() {
		        return this.address.getAddressDetails();
		    }
		    
		    public int getPassengerCount() {
		        return getIdCounter();
		    }
		    
		    public void updateContactDetails(String phone, String email){
		        this.setContact(new Contact(this.getName(), phone, email));
		    }
		    public void updateAddressDetails(String street, String city, String state){
		        this.setAddress(new Address(street, city, state));

		    }
		    
		    public void setAddress(Address address) {
		        this.address = address;
		    }

		    public void setContact(Contact contact) {
		        this.contact = contact;
		    }

		    public int getId() {
		        return id;
		    }

		    public static int getIdCounter() {
		        return idCounter;
		    }



}



