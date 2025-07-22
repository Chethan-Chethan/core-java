class ReverseMultiplication1 {
	public static void main(String [] args) {
		for (int number = 10; number >= 1; number --) {
			System.out.println("Multiplication of Table " + number);
			
		for (int i = 10; i >= 1; i--) {
			System.out.println(number + "x" + i + "=" + (number * i));
		}
		System.out.println();
		}
	}
}