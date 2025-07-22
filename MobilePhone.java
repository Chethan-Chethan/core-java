class MobilePhone {
	String brand;
	double price;
	
	public void setDetails(String b, double p) {
		brand = b;
		price = p;
	}
	
	public void showDetails() {
	System.out.println("Brand Name: " + brand);
	System.out.println("Price: " + price);
	}
	
	public static void main(String [] args) {
		MobilePhone m1 = new MobilePhone();
		MobilePhone m2 = new MobilePhone();
		
		m1.setDetails("Samsung", 18000);
		m2.setDetails("iphone", 75000);
		
		
		m1.showDetails();
		m2.showDetails();
	}
}