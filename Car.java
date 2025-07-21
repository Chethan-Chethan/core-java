class Car {
	
	static String name = "Swift";
	static String company = "Maruti";
	static String color = "Red";
	static float milage = 22.5f;
	static double price = 750000;
	
	public static void main(String [] args) {
		
		String carName = nameOfCar();
		String company = nameOfCompany();
		String carColor = carColor();
		float milage = milage();
		double price = price();
		
		System.out.println("Car Name = " + name);
		System.out.println("Company Name = " + company);
		System.out.println("Car Color = " + carColor);
		System.out.println("Car Millage = " + milage);
		System.out.println("Car Price = " + price);
		
		
	
	
}

public static String nameOfCar(){
return name;}
public static String nameOfCompany() {
return company;}
public static String carColor() {
return color;}	
public static float milage(){
return milage;}
public static double price(){
return price;}

}