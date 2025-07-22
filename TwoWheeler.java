class TwoWheeler {
	
	static String name = "Yamaha";
	static String color = "Red";
	static int speed = 90;
	static boolean stock = true;
	
	public static void main(String [] args) {
		System.out.println("Bike name: " + name);
		
		
		ride(); // direct method call
		TwoWheeler.ride(); // class method call
	}
	
	public static void ride() {
		System.out.println("The " + name + " is riding at " + speed + " km/hr.");
	}
}
