class Bikess {
	private String brand;
	private String model;
	private int cc;
	private double mileage;
	static int maxSpeed;
	
	static {
		System.out.println("Static block in Bike");
		maxSpeed = 120;
	}
	
	{
		System.out.println("Non-Static block in Bike");
	}
	
	public void setBrand(String bikeBrand) {
		brand = bikeBrand;
	}
	
	public void setModel(String bikeModel) {
		model = bikeModel;
	}
	
	public void setCC(int bikeCC) {
		cc = bikeCC;
	}
	
	public void setMileage(double bikeMileage) {
		mileage = bikeMileage;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getCC() {
		return cc;
	}
	
	public double getMileage() {
		return mileage;
	}
	
}
