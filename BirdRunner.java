class BirdRunner {
	
	public static void main(String [] args) {
		
		Bird bird = new Bird();
		
		System.out.println(bird.getName());
		bird.setName("Sparrow");
		String name = bird.getName();
		System.out.println(name);
		
		
		System.out.println("======================");
		Bird bird1 = new Bird("Sparrow");
		System.out.println(bird1.getName());
		System.out.println(bird.getAge());//output will be zero, because age is not initialized in row number 14.
		bird1.setAge(10);
		System.out.println(bird1.getAge());
	}
}
