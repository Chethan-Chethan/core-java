class MobileDevice {
	String brand;
	double price;
	
	public void setBrand(String x) {
		brand = x;
	}
		
	public void setPrice(double y) {	
		price = y;
	}
	
	public void showDetails() {
		System.out.println("Brand " + brand + "Price " + price);
	}
	
	public void comparePrice(MobileDevice other) {
		if (this.price > other.price) {
			System.out.println(this.brand + " more expensive than " + other.brand);
		} else if (this.price < other.price) {
			System.out.println(this.brand + " Cheapest than " + other.brand);
		} else {
			System.out.println("All MobileDevice have same price.");
		}
	}
	
	public static void main(String [] args) {
		MobileDevice m1 = new MobileDevice();
		MobileDevice m2 = new MobileDevice();
		MobileDevice m3 = new MobileDevice();
		
		m1.setBrand("Vivo");
		m1.setPrice(1500);
		m2.setBrand("Realme");
		m2.setPrice(17000);
		m3.setBrand("iphone");
		m3.setPrice(75000);
		
		m1.showDetails();
		m2.showDetails();
		m3.showDetails();
		
		m1.comparePrice(m2);
		m1.comparePrice(m3);
		m2.comparePrice(m1);
		m3.comparePrice(m2);
	}
}