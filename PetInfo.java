class PetInfo {
	public static void main(String [] args) {
		String petInfo = getPetInfo("Dog", "bruno", 5);
		System.out.println(petInfo);
	}
	
	public static String getPetInfo(String type, String name, int age) {
	return "My pet is a " + type + ", named " + name + ", and it is " + age + "years old.";}
}	