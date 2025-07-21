class Laptopss {
	
	private String brand;
	private int price;
	private int ramSize;
	
	public Laptopss() {
		this.brand = "Dell";
		this.price = 55000;
		this.ramSize = 16;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
}
