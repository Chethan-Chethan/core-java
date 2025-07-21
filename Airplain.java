class Airplain {
	
	static String brand = "Air India";
	static String type = "Boeing 777";
	static int speed = 900;
	static boolean flying;
	
	public static void main(String [] args) {
		
		System.out.println("Brand Name: " + brand);
		System.out.println("Plane TYpe: " + type);
		System.out.println("Flight Speed: " + speed);
		System.out.println("Is Flight flying: " + flying); // Default false
		
		
		//fly(); //Direct call method
		Airplain.fly(); // Static call method
		
	}
	
	public static void fly() {
	System.out.println("The " + brand + " " + type + " is flying at " + speed + " km/hr." );}
}