class PetDetails {
	public static void main(String [] args) {
		String details = getPetDetails();
		System.out.println(details);
	}
	
	public static String getPetDetails() {
		String name = "Bruno";
		String type = "Dog";
		int age = 5;
		
	return "My pet is a " + type + ", named " + name + ", and it is " + age + " years old.";}
}