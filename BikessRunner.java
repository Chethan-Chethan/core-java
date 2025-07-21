class BikessRunner {
	public static void main(String [] args) {
		
		System.out.println("Static block in Runner Bike");
		
		Bikess bike = new Bikess();
		bike.setBrand("Pulsur");
		bike.setModel("NS 200");
		bike.setCC(200);
		bike.setMileage(35.89);
		
		System.out.println("Bike Brand: " + bike.getBrand());
		System.out.println("Bike Model: " + bike.getModel());
		System.out.println("Bike CC: " + bike.getCC() + "CC");
		System.out.println("Mileage: " + bike.getMileage() + " Km/hr.");
		System.out.println("Max Speed: " + Bikess.maxSpeed + " Km/hr.");
		
	}
}