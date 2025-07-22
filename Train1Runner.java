class Train1Runner {
	public static void main(String [] args) {
		String name = Train1.getTrainName();
		int capacity = Train1.getTotalPassengerCapacity();
		float tripFare = Train1.calculateTotalFareForTrip();
		float fareForFive = Train1.getTicketRate(Train1.ticketRate);
		
		System.out.println("Train Name = " + name);
		System.out.println("Total Passenger Capacity = " + capacity);
		System.out.println("Total Fare Collected in one Trip = " + tripFare);
		System.out.println("Fare for 5 passengers = " + fareForFive);
	}
}