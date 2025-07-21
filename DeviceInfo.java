class DeviceInfo {
	public static void main(String [] args) {
		String name = getDeviceName();
		double price = getPrice();
		boolean isAndroid = checkIfAndroid();
		String version = getVersion();
		
		
		System.out.println("Device Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Is Android: " + isAndroid);
		System.out.println("Version: " + version);
	}
	
	public static String getDeviceName() {
	return "Lenovo Tab";}
	
	public static double getPrice() {
	return 15000;}
	
	public static boolean checkIfAndroid() {
	return true;}
	
	public static String getVersion() {
	return "Android 11";}
}



		
		
 
