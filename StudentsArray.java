class StudentsArray {
	
	static byte [] ages = {20, 21, 22};
	static short [] rollNos = {101, 102, 103};
	static int [] marks = {80, 85, 90};
	static long [] phones = {9876549032L, 7865439021L, 8976543920L};
	static float [] percentages = {75.5f, 82.3f, 90.4f};
	static double [] scores = {85.6, 90.0, 78.5};
	static char [] grades = {'A', 'B', 'A'};
	static boolean [] passStatus = {true, true, false};
	static String [] studentNames = {"Chethan", "Manoj", "Vinay"};
	
	public static String [] getStudentNames() {
		return studentNames;
	}
	public static byte [] getAges() {
		return ages;
	}
	public static short [] getRollNos() {
		return rollNos;
	}
	public static int [] getMarks() {
		return marks;
	}
	public static long [] getPhones() {
		return phones;
	}
	public static float [] getPercentages() {
		return percentages;
	}
	public static double [] getScores() {
		return scores;
	}
	public static char [] getGrades() {
		return grades;
	}
	public static boolean [] getPassStatus() {
		return passStatus;
	}
}