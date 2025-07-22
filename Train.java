class Train {
	static String name = "Rajdhani Express";
	static String color = "Blue";
	static int speed = 160;
	static boolean isAvailable;
	
	public static void main(String [] args) {
		//System.out.println(Train.name); // with class name
		//System.out.println("Name: " + name); // without class name
		//System.out.println("Color: " + color);
		//System.out.println("Speed: " + speed);
		//System.out.println("Available: " + isAvailable); // default false
		
		move(); // direct method call
		Train.move(); //class name method call
	}
		
		public static void move() {
			System.out.println("The " + name +  " train is moving at  a speed of " + speed + " km/hr.");
		}
	}
	