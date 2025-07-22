class Person {
	private String name;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String [] args) {
		Person person1 = new Person();
		
		person1.setName("Rahul");
		String result = person1.getName();
		
		System.out.println("Person Name is " + result);
	}
}