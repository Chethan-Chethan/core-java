class StudentDetails {
	public static void main(String [] args) {
		String details = getStudentDetails("Ravi", 20, "Math" );
		System.out.println(details);
	}
	
	public static String getStudentDetails(String name, int age, String subject) {
	return "Student name is " + name + ", age is " + age + ", favorite subject is " + subject + ".";}
}