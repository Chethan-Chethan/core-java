class Train1 {
	static String trainName = "Shatabdi Express";
	static int trainNumber = 12001;
	static byte numberOfCoaches = 10;
	static int passengerPerCoach = 72;
	static float ticketRate = 345f;
	
	public static int getTotalPassengerCapacity() {
		return numberOfCoaches * passengerPerCoach;
	}
	
	public static float calculateTotalFareForTrip() {
		return ticketRate * getTotalPassengerCapacity();
	}
	
	public static float getTicketRate(float rate) {
		return rate * 5; //fare for 5 person
	}
	
	public static String getTrainName() {
	return trainName;}
}





	