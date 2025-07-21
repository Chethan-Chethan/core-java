class EvenOdd {
	public static void main(String [] args) {
		int number = 2;
		System.out.println(checkEvenOdd(number));
	}
	
	public static String checkEvenOdd(int number) {
		if (number % 2 ==0) {
		return "Yes, it is even"; }
			else {
				return "No, it is odd";
			}
		}
	}
