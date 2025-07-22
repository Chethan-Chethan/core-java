class LoopStep2 {
	public static void main(String [] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Number: " + i);
			
			if (i % 2 == 0) {
				System.out.println("-> Even");
			} else {
				System.out.println("-> Odd");
			}
			
			System.out.println(); // blank line between numbers
		}
	}
}