class Cars {
	private String brand;
	private String model;
	private int year;
	private double price;
	static int maxSpeed;
	
	static {
		System.out.println("Static block in car");
		maxSpeed = 200;
	}
	
	{
		System.out.println("Non-static block in car");
	}
	
	public void setBrand(String carBrand) {
		brand = carBrand;
	}
	
	public void setModel(String carModel) {
		model = carModel;
	}
	
	public void setYear(int carYear) {
		year = carYear;
	}
	
	public void setPrice(double carPrice) {
		price = carPrice;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
}

		