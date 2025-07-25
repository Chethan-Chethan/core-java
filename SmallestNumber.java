class SmallestNumber {
	public static void main(String [] args) {
		
		int a = 50;
		int b = 40;
		int c = 90;
		if (a <= 0 && b <= 0 && c <= 0) {
			System.out.println("Invalid Number");
		}
		else if (a < b && a < c) {
			System.out.println("A is Smallest :" + a);
		} else if (b < a && b < c) {
			System.out.println("B is Smallest :" + b);
		} else if (c < a && c < b) {
			System.out.println("C is Smallest :" + c);
		} else {
			System.out.println("Two or more numbers are equal");
		}
	}
}
			