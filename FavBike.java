class FavBike {

static String name = "NS 200";

public static void main(String [] args) {
	
	String bikeName = nameOfBike(); //method call
	System.out.println("Bike Name is = " + bikeName);
}

public static String nameOfBike() {
return name;}
}