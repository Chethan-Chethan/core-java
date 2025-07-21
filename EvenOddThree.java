class EvenOddThree {
	public static void main(String [] args) {
		int num1 = 4;
		int num2 = 7;
		int num3 = 10;
		
		System.out.println(checkEvenOdd(num1));//calling argument
		System.out.println(checkEvenOdd(num2));//calling argument
		System.out.println(checkEvenOdd(num3));//calling argument
	}
	
	public static String checkEvenOdd (int num) {
		if (num % 2 == 0) {
		return "Yes, it is Even";}
		else {
		return "No, it is odd";}
	}
}