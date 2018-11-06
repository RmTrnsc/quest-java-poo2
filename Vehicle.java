public abstract class Vehicle {
	
	//attributs
	private String brand;
	private int kilometers;
	
	//constructeur
	public Vehicle (String brand) {
		this.brand = brand;
		this.kilometers = 0;
	}
	
	//getters
	public String getBrand() {
		return this.brand;
	}
	
	public int getKilometers() {
		return this.kilometers;
	}
	
	//setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//méthode
	public abstract String doStuff();
}