class BusesRunner {
	public static void main (String [] args) {
		
		Buses bus = new Buses();
		bus.setName("Benz");
		bus.setNumber(1234);
		bus.setType("Diesel");
		
		System.out.println("Bus Name: " + bus.getName());
		System.out.println("Bus Number: " + bus.getNumber());
		System.out.println("Bus Type: " + bus.getType());
		System.out.println("Max speed: " + Buses.maxSpeed);
		
	}
}