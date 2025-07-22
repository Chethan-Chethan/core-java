class MultiplicationTable1 {
	public static void main(String [] args) {
		for (int number =2; number <= 10; number += 3) { //outer loop
			System.out.println("Multiplication of Table " + number);
		for (int i = 1; i <= 10; i++) { //inner loop
 			System.out.println(number + "x" + i + "=" + (number * i));
		}
		System.out.println();//blank line between tables
		}
	}
}