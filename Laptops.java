class Laptops {
	String brand;
	float price;
	int storage;
	String processor;
	boolean isTouchScreen;
	
	public Laptops() {
	}
	
	public void setDetails(String [] args) {
		Laptops laptop1 = new laptop();
		Laptops.brand = "HP";
		System.out.println(Laptops.brand);
		laptop1.setName("Lenovo");
		System.out.println(laptop1.brand);
	}
}
	