class ProductRunner {
	
	public static void main(String [] args) {
		
		Product p1 = new Product();
		p1.setName("Pen");
		p1.setPrice(10.5);
		p1.setQuantity(50);
		
		Product p2 = new Product();
		p2.setName("NoteBook");
		p2.setPrice(25);
		p2.setQuantity(50);
		
		Product p3 = new Product();
		p3.setName("Pencil");
		p3.setPrice(5);
		p3.setQuantity(150);
		
		Product p4 = new Product();
		p4.setName("Eraser");
		p4.setPrice(3);
		p4.setQuantity(150);
		
		Product p5 = new Product();
		p5.setName("Sharpener");
		p5.setPrice(7.5);
		p5.setQuantity(120);
		
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getQuantity());
		
		System.out.println();
		
		System.out.println(p2.getName());
		System.out.println(p2.getPrice());
		System.out.println(p2.getQuantity());
		
		System.out.println();
		
		System.out.println(p3.getName());
		System.out.println(p3.getPrice());
		System.out.println(p3.getQuantity());
		
		System.out.println();
		
		System.out.println(p4.getName());
		System.out.println(p4.getPrice());
		System.out.println(p4.getQuantity());
		
		System.out.println();
		
		System.out.println(p5.getName());
		System.out.println(p5.getPrice());
		System.out.println(p5.getQuantity());
		System.out.println();
		System.out.println("Parameterized constructor");
		
		Product p6 = new Product("Mouse", 500, 20);
		Product p7 = new Product("Keyboard", 800, 15);
		Product p8 = new Product("Monitor", 5500, 10);
		Product p9 = new Product("CPU", 7000, 8);
		Product p10 = new Product("Printer", 4500, 5);
		
		System.out.println(p6.getName());
		System.out.println(p6.getPrice());
		System.out.println(p6.getQuantity());
		
		System.out.println();
		System.out.println(p7.getName());
		System.out.println(p7.getPrice());
		System.out.println(p7.getQuantity());
		
		System.out.println();
		System.out.println(p8.getName());
		System.out.println(p8.getPrice());
		System.out.println(p8.getQuantity());
		
		System.out.println();
		System.out.println(p9.getName());
		System.out.println(p9.getPrice());
		System.out.println(p9.getQuantity());
		
		System.out.println();
		System.out.println(p10.getName());
		System.out.println(p10.getPrice());
		System.out.println(p10.getQuantity());
		
		System.out.println();
		System.out.println("Reinitialized using SetMethod");
		
		p6.setName("Wireless Mouse");
		p6.setPrice(750);
		p6.setQuantity(25);
		
		p7.setName("Mechanical Keyboard");
		p7.setPrice(1200);
		p7.setQuantity(10);
		
		p8.setName("LED Monitor");
		p8.setPrice(6000);
		p8.setQuantity(12);
		
		p9.setName("High-end CPU");
		p9.setPrice(9500);
		p9.setQuantity(6);
		
		
		p10.setName("Color Printer");
		p10.setPrice(5000);
		p10.setQuantity(4);
		
		
		System.out.println(p6.getName());
		System.out.println(p6.getPrice());
		System.out.println(p6.getQuantity());
		System.out.println();
		System.out.println(p7.getName());
		System.out.println(p7.getPrice());
		System.out.println(p7.getQuantity());
		System.out.println();
		System.out.println(p8.getName());
		System.out.println(p8.getPrice());
		System.out.println(p8.getQuantity());
		System.out.println();
		System.out.println(p9.getName());
		System.out.println(p9.getPrice());
		System.out.println(p9.getQuantity());
		System.out.println();
		System.out.println(p10.getName());
		System.out.println(p10.getPrice());
		System.out.println(p10.getQuantity());
		
		
		
	}
	
}
