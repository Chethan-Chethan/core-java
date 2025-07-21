class DeviceCheck {
	public static void main(String [] args) {
		double cost = 20000;
		String result = isExpenciveDevice(cost); //Giving Argument
		System.out.println(result);
	}
	
	public static String isExpenciveDevice(double cost) {
		if (cost > 20000) {
			return "Yes, it's expensive";
		} else{
			return "No, it's affordable";
		}
	}
}
		