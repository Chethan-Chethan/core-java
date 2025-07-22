class van {
	static String name;
    static String color;
	static int speed = 80;
	static boolean stock;
	
	public static void main(String [] args) {
		//String name = "" ;
		System.out.println(van.name);
		System.out.println("name" + name);
		name = "Maruthi Van";
		System.out.println("name" + name);
		System.out.println(color);
		System.out.println(speed);
		System.out.println(stock);
	
	drive();
	van.drive();
	System.out.println(van.name);
	}
	public static void drive() {
	System.out.println("The" + name + "van" + "is driving with a" + speed +"km/hr");}
}
	
		
	