class Bird {
	
	private String name;
	private int age;
	
	public Bird() {//Deafault constructor
		System.out.println("No aurgument constructor / default constructor");
		this.name = "Piegon";
	}
	
	//public Bird(String name) {//constructor with one parameter
	//	System.out.println("Parameterized constructor with one parameter");
	//	this.name = name;
	}
	
	public Bird(String name, int age) {//constructor with 2 parameter
		System.out.println("parameterized constructor");
		this.name = name;
		this.age = age;
		
	}
	
	//public void setName(String name) {
	//	this.name = name;
	}
	
	//public String getName() {
	//	return name;
	}
	
	//public void setAge(int age) {
	//	this.age = age;
	}
	
	//public int getAge() {
	//	return age;
	}
	
	
}
	

