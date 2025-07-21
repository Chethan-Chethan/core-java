class Buses {
	private String name;
	private int number;
	private String type;
	static int maxSpeed;
	
	static {
		maxSpeed = 120;
	}
	
	{
		System.out.println("Bus object is created");
	}
	
	public void setName(String busesName) {
		name = busesName;
	}
	
	public void setNumber(int busesNumber) {
		number = busesNumber;
	}
	
	public void setType(String busesType) {
		type = busesType;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
}
	