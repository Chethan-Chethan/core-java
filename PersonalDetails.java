class PersonalDetails {
	public static void main(String [] args) {
		String details = getMyDetails();
		System.out.println(details);
	}
	
	public static String getMyDetails() {
		String name = "Chethan G";
		String village = "Batlahalli";
		String fruit = "Mango";
		
	return "My name is " + name + ",iam from " + village + ",my favroite fruit is " + fruit + ".";}
}