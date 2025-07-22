class Trainss {
	
	private String name;
	private long number;
	private String type;
	private int coaches;
	static int maxSpeed;
	
	static {
		System.out.println("Static block in Train");
		maxSpeed = 300;
	}
	
	{
		System.out.println("Non-static block in Train");
	}
	
	public void setName(String trainName) {
		name = trainName;
	}
	
	public void setNumber(long trainNumber) {
		number = trainNumber;
	}
	
	public void setType(String trainType) {
		type = trainType;
	}
	
	public void setCoaches(int trainCoaches) {
		coaches = trainCoaches;
	}
	
	public String getName() {
		return name;
	}
	
	public long getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCoaches() {
		return coaches;
	}
	
}
