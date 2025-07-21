class Laptop1 {
	private String brand;
	private float price;
	private int ram;
	private int storage;
	private String processor;
	
	static String type = "Electronics";
	static String category = "Computers";
	
	public void setMethod(String brand, float price, int ram, int storage, String processor) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		this.processor = processor;
	}
	
	public String getMethod() {
	return "Laptop [Brand = " + brand + ", price= " + price + ", Ram = " + ram + "GB, Storage = " + storage + "GB, Processor = " + processor + "]";
	}
}
		