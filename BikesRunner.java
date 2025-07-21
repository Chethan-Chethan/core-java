class BikesRunner {
	
	public static void main(String [] args) {
		
		Bikes bike = new Bikes();
		bike.setName("NS 200");
		bike.setCost(180000);
		bike.setSpeed(120);
		
		System.out.println(bike.getName());
		System.out.println(bike.getCost());
		System.out.println(bike.getSpeed());
		
	}
}
