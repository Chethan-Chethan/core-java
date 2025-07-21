class LaptopssRunner {
	
	public static void main(String [] args) {
		Laptopss laptop = new Laptopss();
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRamSize());
		System.out.println();
		laptop.setBrand("HP");
		laptop.setPrice(50000);
		laptop.setRamSize(18);
		String brand = laptop.getBrand();
		int price = laptop.getPrice();
		int ramSize = laptop.getRamSize();
		System.out.println(brand);
		System.out.println(price);
		System.out.println(ramSize);
	}
	
	
}