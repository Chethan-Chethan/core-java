class ShipRunner {
	public static void main(String [] args) {
		
		System.out.println("Static block of Runner ship");
		
		Ship ship = new Ship();
		ship.setName("DreamLiner");
		ship.setType("Cargo");
		ship.setCapacity(100000);
		ship.setLength(6000);
		System.out.println();
		System.out.println("Ship: " + ship.getName());
		System.out.println("Ship Type: " + ship.getType());
		System.out.println(ship.getType() + " has " + ship.getCapacity() + " tons of carrying capacity");
		System.out.println(ship.getName() + " has Length of " + ship.getLength() + " meters.");
		System.out.println(ship.getType() + " max speed " + Ship.maxSpeed + " Nauticals.");
		
	}
}






//static block will be executed when class is loaded or static variable or static method is called
//static block will be executed only once
// in static block non static varible can be intialized 
//static block is used to initialize static variable and load static method

//Non-static will be executed when object created
//non-static block will be executed many time based on number of objects created
//non-static block we can intilialize static variable