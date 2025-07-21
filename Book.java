class Book {
	String title;
	String author;
	int price;
	
	public void setDetails(String t, String a, int p) {
		
		title = t;
		author = a;
		price = p;
	}
	
	public void showDetails() {
		System.out.println("Title: " + title + ", Author: " + author + ", Book Price: " + price);

	}

	public static void main(String [] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.setDetails("Atomic Habits", "James Clear", 499);//calling with aurgument
		b2.setDetails("Ikigai", "Hector Garcia", 350);//calling with aurgument
		
		b1.showDetails();//calling without aurgument
		b2.showDetails();//calling without aurgument
		
	}
}
		