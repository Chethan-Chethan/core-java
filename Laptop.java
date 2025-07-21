class Laptop {
	String brand;
	double price;
	
	public void setDetails(String b, double p) {
		brand = b;
		price = p;
	}
	
	public void showDetails() {
		System.out.println("Brand: " + brand + ", Price: " + price);
	}
	
	public static void main(String [] args) {
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		
		l1.setDetails("Lenovo", 55000);
		l2.setDetails("Dell", 68000);
		
		l1.showDetails();
		l2.showDetails();
		l1.comparePrice(l2);//call the comparison method
		
	}
	
	public void comparePrice(Laptop other) {
		if (this.price > other.price) {
			System.out.println(this.brand + " is more expensive than " + other.brand);
		} else if (this.price < other.price) {
			System.out.println(other.brand + " is more expensive than " + this.brand);
		} else {
			System.out.println("Both laptops have the same price.");
		}
	}
}
