public class Boat extends Vehicle {
	
	private boolean  glou;
	
	public Boat(String brand) {
		super(brand);
		this.glou = false;
	}
	
	@Override
    public String doStuff() {
        return "glou glou !";
    }
  
    public boolean isGlou() {  
        return glou;  
    }  
  
    public void setGlou(boolean glou) {  
        this.glou = glou;  
    }
}