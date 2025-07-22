class Temperature {
	public static void main(String [] args) {
		int temp = 30;
		System.out.println(checkTemperature(temp)); //calling arguement
	}
	
	public static String checkTemperature(int temp) {
		if (temp >= 30) {
		return "Yes, temp is hot"; }
		else { 
		return "No, temp is cool";}
	}
}