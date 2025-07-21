class Bike {
	
	static String name;
	static String color;
    static String company;
	static float price=50000;
	public static void main (String [] args) {
	String name = "Pulsur";
    float price =10000.34f;
	float milage= 35.66f;
	String color= "Blue";
	String company = "xworkz";
System.out.println(name);	
System.out.println(price);
System.out.println(milage);
System.out.println(color);
System.out.println(company);


String bikeName = nameOfBike();
System.out.println(bikeName);
nameOfColor();
nameOfCompany();
System.out.println(bikeName);
System.out.println(getPriceforBikes(5));
}
public static String nameOfBike() {
return name;}
	public static String nameOfColor() {
return color;}
public static String nameOfCompany() {
return company;}




public static float getPriceforBikes(int numberOfBikes) {
	return numberOfBikes * price;
}

}


		