class Bus1 {
	
	
		
		static char busSeries = 'A';
		static short busNumber = 5467;
		static float milage = 15.3f;
		static int price = 500000;
		static int numberOfPassenger = 20;
		static int ticketPrice = 15;
		
	
	public static void main(String [] args) {
		//short busNumber = Bus1.busNumber;
		//int ticketPrice = Bus1.getTicketPrice(8); // with argument	
		int totalAmount= Bus1.totalAmountInTrip();
		//float milage = Bus1.getMilage();
		
		
		System.out.println("Bus Number = " + busNumber); 
		System.out.println("Total Amount in a trip =" + totalAmount);
		System.out.println("Bus fare for 8 passengers " + ticketPrice);
		System.out.println ("Bus Milage = " + milage);
		
		


	}
	
	
	public static int getTotalPrice(int numberOfBuses) {
		
		int totalPrice = price * numberOfBuses;
		//System.out.println(totalPrice);
		return totalPrice;
	}
	 
	public static int totalAmountInTrip() {  
		
		int totalAmount =numberOfPassenger * ticketPrice;
		return totalAmount;
	}
	
	public static int getTicketPrice(int ticketPrice) {
		
		int getTicketPrice = ticketPrice * 8;
        return getTicketPrice;		
	}
		
		public static float getMilage() {

        float getMillage = milage;
        return milage;		
}
}
		
		
			
		
		
	

  
