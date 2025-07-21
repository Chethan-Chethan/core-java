class CarsRunner {
	public static void main(String [] args) {
		
		System.out.println("Static block in Runner car");
		
		Cars car = new Cars();
		car.setBrand("KIA");
		car.setModel("Seltos");
		car.setYear(2025);
		car.setPrice(2500000);
		
		System.out.println("Car Brand: " + car.getBrand());
		System.out.println("Model: " + car.getModel());
		System.out.println("Year: " + car.getYear());
		System.out.println("Car Price: " + car.getPrice());
		System.out.println("Max Speed: " + Cars.maxSpeed);
	}
}