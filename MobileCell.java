
class MobileCell {
	String brand;
	double price;
	
	public void setDetails(String b, double p) {
		brand = b;
		price = p;
	}
	
	public void showDetails() {
		System.out.println("Brand: " + brand + ", Price: " + price);
		
	}
	
	public void comparePrice(MobileCell other) {
		if (this.price > other.price) {
			System.out.println(this.brand + "is more expencive than " + other.brand);
		} else if (this.price < other.price) {
			System.out.println(this.brand + " is less expensive than " + other.brand);
		} else {
			System.out.println("Bothe MobileCell have same price.");
		}
	}
	
	public static void main(String [] args) {
		MobileCell m1 = new MobileCell();//constructor
		MobileCell m2 = new MobileCell();//constructor
		
		m1.setDetails("Samsung", 18000);
		m2.setDetails("iphone", 75000);
		
		m1.showDetails();
		m2.showDetails();
		
		m1.comparePrice(m2);//Compare price
	}
}
			