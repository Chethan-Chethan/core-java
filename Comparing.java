class Comparing {
	public static void main(String [] args) {
		int num1 = 40;
		int num2 =40;
		System.out.println(compareTwoNumbers(num1, num2)); //calling argument
	}
	
	public static String compareTwoNumbers(int num1, int num2) {
		if (num1 > num2) {
			return "Number1 is greater than Number2";
		} else if (num1 < num2) {
			return "Number1 is less than Number2";
		} else {
			return "Both Number are Equal";
	}
}

}
