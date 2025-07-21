class Bus {
	static String name = "Benz";
    static String color = "Black";
	static int speed = 120;
	static boolean stock;
	
	public static void main(String [] args) {
		//String name = "" ;
		System.out.println(Bus.name);
		System.out.println("name" + name);
		//name = "Volvo";
		System.out.println("name" + name);
		System.out.println(color);
		System.out.println(speed);
		System.out.println(stock);
	
	drive();
	Bus.drive();
	System.out.println(Bus.name);
	}
	public static void drive() {
	System.out.println("The" + name + "Bus" + "is driving with a" + speed +"km/hr");}
}
	
		
	