class Bus1Runner {
	
	public static void main(String [] args) {
		short busNumber = Bus1.busNumber;
		int ticketPrice = Bus1.getTicketPrice(8); // with argument	
		int totalAmount= Bus1.totalAmountInTrip();
		float milage = Bus1.getMilage();
		
		
		System.out.println("Bus Number = " + busNumber); 
		System.out.println("Total Amount in a trip =" + totalAmount);
		System.out.println("Bus fare for 8 passengers " + ticketPrice);
		System.out.println ("Bus Milage = " + milage);
		
		


	}
}
	