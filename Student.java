class Student {
	
	String name = "Ravi";
	int age = 20;
	
	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	public static void main(String [] args) {
		Student s1 = new Student(); // object created
		s1.show(); // calling method using object
	}
}
		