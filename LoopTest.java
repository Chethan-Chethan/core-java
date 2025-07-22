class LoopTest {
	public static void main(String [] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("Number: " + i);
			
			if (i % 2 == 0) {
				System.out.println("-> Even");
			} else {
				System.out.println("-> Odd");
			}
			
			if (i % 3 == 0) {
				System.out.println("-> Divisible by 3");
			}
			
			if (i % 5 == 0) {
				System.out.println("-> Divisibleby 5");
			}
			
			System.out.println();
		}
	}
}
