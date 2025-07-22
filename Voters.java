class Voters {
	public static void main(String [] args) {
		int age = 18;
		String result = checkEligibilityToVote(age);
		System.out.println(result);
	}
	
	public static String checkEligibilityToVote(int age) {
		if (age >= 18) {
			return "You'r eligible to vote"; 
		} else {
			return "You'r not eligible to vote";
		}
	}
}

		