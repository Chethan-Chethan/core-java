class PlaneRunner {
	public static void main(String [] args) {
		
		System.out.println("Static block of Runner Plane");
		
		Plane plane = new Plane();
		plane.setAirline("Air India");
		plane.setModel("Boeing 777");
		plane.setSeats(65);
		plane.setRange(12000);
		System.out.println();
		System.out.println("Plane: " + plane.getAirline());
		System.out.println("Model: " + plane.getModel());
		System.out.println(plane.getModel() + " has " + plane.getSeats() + " seats");
		System.out.println(plane.getAirline() + " has " + plane.getRange() + " Km range.");
		System.out.println(plane.getModel() + " travels upto " + Plane.maxAltitude + " feets altitude.");
		
	}
}
