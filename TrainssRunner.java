class TrainssRunner {
	public static void main(String [] args) {
		
		System.out.println("Static block of Runner Train");
		
		Trainss train = new Trainss();
		train.setName("Mini-Bullet Train");
		train.setNumber(1234567);
		train.setType("Vande Bharath");
		train.setCoaches(18);
		System.out.println();
		System.out.println("Train Name: " + train.getName());
		System.out.println("Train Number: " + train.getNumber());
		System.out.println(train.getType());
		System.out.println(train.getType() + " has " + train.getCoaches() + "coaches");
		System.out.println("Max Speed of " + train.getType() + ":" + Trainss.maxSpeed + " Km/hr.");
		
	}
}
		