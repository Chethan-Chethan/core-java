class ReverseMultiplication2 {
	public static void main(String [] args) {
		for (int number = 9; number >= 3; number -=3) {
			System.out.println();//prints blank line
			System.out.println("Multiplication of Table " + number);
		for (int i = 10; i >= 1; i--) {
			System.out.println(number + "x" + i + "=" + (number * i));
		}
		System.out.println();
		}
	}
}
