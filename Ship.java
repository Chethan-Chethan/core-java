class Ship {
	private String name;
	private String type;
	private int capacity;
	private int length;
	static int maxSpeed;
	
	static {
		System.out.println("Static block in ship");
		maxSpeed = 60;
	}
	
	{
		System.out.println("Non-static block in ship");
	}
	
	public void setName(String shipName) {
		name = shipName;
	}
	
	public void setType(String shipType) {
		type = shipType;
	}
	
	public void setCapacity(int shipCapacity) {
		capacity = shipCapacity;
	}
	
	public void setLength(int shipLength) {
		length = shipLength;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getLength() {
		return length;
	}
	
}
