public class Hangar {
	
	public static void main (String[]args) {
		
		Car clio = new Car ("Clio");
		clio.setKilometers(127000);
		System.out.println("Je suis " + clio.getBrand() + " et je fais " + clio.doStuff() + " et j'ai " + String.valueOf(clio.getKilometers()) + " kilometres au compteur !");
		System.out.println();
		
		Boat titanic = new Boat ("Titanic");
		titanic.setKilometers(12700000);
		System.out.println("Je suis " + titanic.getBrand() + " et je fais " + titanic.doStuff());
	}
}