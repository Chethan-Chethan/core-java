class Students {
	String name;
	int rollNumber;
	int age;
	char grade;
	float marks;
	
	public void setName(String n) {
		name = n;
	}
	
	public void setRollNumber(int r) {
		rollNumber = r;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setGrade(char g) {
		grade = g;
	}
	
	public void setMarks(float m) {
		marks = m;
	}
	
	public void showDetails() {
		System.out.println("Student Name " + name);
		System.out.println("Student Roll Number " + rollNumber);
		System.out.println("Student Age " + age);
		System.out.println("Student Grade " + grade);
		System.out.println("Student Marks " + marks);
	}
	
	public static void main(String [] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students s4 = new Students();
		Students s5 = new Students();
		Students s6 = new Students();
		Students s7 = new Students();
		Students s8 = new Students();
		Students s9 = new Students();
		Students s10 = new Students();
		
		s1.setName("Chethan");
		s2.setName("Narendra");
		s3.setName("Swapna");
		s4.setName("Chaitra");
		s5.setName("Lokesh");
		s6.setName("Vignesh");
		s7.setName("Bharat");
		s8.setName("Vinay");
		s9.setName("Manoj");
		s10.setName("Padma");

		s1.setRollNumber(1234);
		s2.setRollNumber(5678);
		s3.setRollNumber(9012);
		s4.setRollNumber(3456);
		s5.setRollNumber(7890);
		s6.setRollNumber(1123);
		s7.setRollNumber(4567);
		s8.setRollNumber(8910);
		s9.setRollNumber(2123);
		s10.setRollNumber(2456);
		
		s1.setAge(28);
		s2.setAge(30);
		s3.setAge(25);
		s4.setAge(26);
		s5.setAge(29);
		s6.setAge(35);
		s7.setAge(39);
		s8.setAge(22);
		s9.setAge(29);
		s10.setAge(21);
		
		s1.setGrade('B');
		s2.setGrade('A');
		s3.setGrade('A');
		s4.setGrade('A');
		s5.setGrade('B');
		s6.setGrade('C');
		s7.setGrade('D');
		s8.setGrade('A');
		s9.setGrade('C');
		s10.setGrade('A');
		
		s1.setMarks(65);
		s2.setMarks(85);
		s3.setMarks(90);
		s4.setMarks(92);
		s5.setMarks(66);
		s6.setMarks(35);
		s7.setMarks(27);
		s8.setMarks(88);
		s9.setMarks(38);
		s10.setMarks(99);
		
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();
		s4.showDetails();
		s5.showDetails();
		s6.showDetails();
		s7.showDetails();
		s8.showDetails();
		s9.showDetails();
		s10.showDetails();
		
	}
}