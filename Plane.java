class Plane {
	private String airline;
	private String model;
	private int seats;
	private double range;
	static int maxAltitude;
	
	static {
		System.out.println("Static block in plane");
		maxAltitude = 40000;
	}
	
	{
		System.out.println("Non-static block in plane");
	}
	
	public void setAirline(String planeAirline) {
		airline = planeAirline;
	}
	
	public void setModel(String planeModel) {
		model = planeModel;
	}
	
	public void setSeats(int planeSeats) {
		seats = planeSeats;
	}
	
	public void setRange(double planeRange) {
		range = planeRange;
	}
	
	public String getAirline() {
		return airline;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public double getRange() {
		return range;
	}
	
}
