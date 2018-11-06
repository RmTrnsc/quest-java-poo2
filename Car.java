public class Car extends Vehicle {
	
	private boolean  vroum;
	
	public Car(String brand) {
		super(brand);
		this.vroum = false;
	}
	
	@Override
    public String doStuff() {
        return "vroum vroum !";
    }
  
    public boolean isVroum() {  
        return vroum;  
    }  
  
    public void setVroum(boolean vroum) {  
        this.vroum = vroum;  
    }
}