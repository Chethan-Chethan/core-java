class ElephantRunner {
	
	public static void main(String [] args) {
		
		Elephant elephant = new Elephant();
		System.out.println(elephant.getName());
		System.out.println(elephant.getAge());
		System.out.println(elephant.getWeight());
		elephant.setName("Arjuna");
		String name = elephant.getName();
		System.out.println(name);
		elephant.setAge(88);
		int age = elephant.getAge();
		System.out.println(age);
		elephant.setWeight(706);
		int weight = elephant.getWeight();
		System.out.println(weight);
		
	}
}