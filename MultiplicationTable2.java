class MultiplicationTable2 {
	public static void main(String [] args) {
		for (int number = 12; number <= 20; number += 3) {
			System.out.println("Multiplication of Table " + number);
		for (int i =1; i <= 10; i++) {
			System.out.println(number + "x" + i + "=" + (number * i));
		//System.out.println();
		}
		System.out.println();
		}
	}
}