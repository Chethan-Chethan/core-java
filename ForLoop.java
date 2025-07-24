class ForLoop {
	
	public static final String EXECUTION = "Executing forloop"; // instance variable
	public static void main(String [] args) {
		final String EXCEUTION = "Executing forloop"; // local variable
		int a = 10;
		System.out.println(a);
		
		for (int i =0; i<1000; i++) {
			int z = i + 1;
			
			//System.out.println("Exectuing forloop" + (i+1));
			//System.out.println("Executing forloop" + z);
			//System.out.println(EXCEUTION + z);
			
			//if-else condition
			if (z % 15 == 0) {
				System.out.println(z + " - Divisible by boyh 3 and 5");
			}
			else if (z % 3 == 0) {
				System.out.println(z + " - Divisible by 3");
			}
			else if (z % 5 == 0) {
				System.out.println(z + " - Divisible by 5");
			}
			else if (z % 2 == 0) {
				System.out.println(z + " - Even Number");
			}
			else {
				System.out.println(z + " - Odd Number");
			}
				
		}
	}
}


