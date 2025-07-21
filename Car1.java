class Car1 {
	
	static String brand = "Toyota";
	static String model = "Fortuner";
	static int topSpeed = 180;
	static boolean isAvailable;
	
	public static void main(String [] args) {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Top Speed: " + topSpeed);
		System.out.println("Available: " + isAvailable); //default false
	
	showDetails();//method call
	}
	
	
	public static void showDetails() {
		System.out.println("The " + brand + " " + model +" " + "runs at a speed  of" + " " +  topSpeed + " km/hr.");
	}
}