class TrainsRunner {
	
	static {
		System.out.println("static block in train runner");
	}
	
	public static void main(String [] args) {
		System.out.println("Length:" + Trains.length);
		Trains train = new Trains();
		System.out.println(train.length);
		train.setName("Rajdhani");
		System.out.println(train.getName());
		System.out.println(Trains.length);
		
		
		System.out.println("==========================");
		Trains train1 = new Trains();
		System.out.println(train1.length);
		System.out.println(train1.getName());
		
		train.length = 300;
		System.out.println(train.length);
		System.out.println(train1.length);
	}
}