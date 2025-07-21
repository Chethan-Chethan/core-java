class Carss {
	private String brand;
	private int modelYear;
	private int price;
	
	public Carss() {
		
	}
	
	
	
	public Carss(String brand, int modelYear, int price) {
		this.brand = "Defender";
		this.modelYear = modelYear;
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
}