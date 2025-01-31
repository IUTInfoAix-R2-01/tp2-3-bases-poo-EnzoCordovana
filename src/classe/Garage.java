package classe;

public class Garage {
	public static void main(String[] args) {
		Moto myMoto = new Moto("Mototo","suzuki", 4300);
		myMoto.noise();
		System.out.println(myMoto.getModel());
		System.out.println(myMoto.getPrice());
		
		Voiture myVoiture = new Voiture("Voiturere", "ferari", 13000);
		myVoiture.noise();
		System.out.println(myVoiture.getModel());
		System.out.println(myVoiture.getPrice());
	}
}
