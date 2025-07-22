class Student1 {
	String name;
	int age;
	
	public void setDetails(String n, int a) {
		name = n;
		age = a;
	}
	
public void showDetails() {
	System.out.println("Name: " + name + ", Age:" + age);
}

public static void main(String [] args) {
	Student1 s1 = new Student1();
	Student1 s2= new Student1();
	
	s1.setDetails("Ravi" , 20);
	s2.setDetails("Chethan" , 28);
	
	s1.showDetails(); //Ravi
	s2.showDetails(); //Chethan
}
}