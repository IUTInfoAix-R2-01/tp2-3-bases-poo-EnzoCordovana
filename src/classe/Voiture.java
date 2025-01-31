package classe;

public class Voiture extends Vehicule {

	Voiture(String name, String modele, int price) {
		super(name, modele, price);
	}

	@Override
	void noise() {
		System.out.println("VROOUUMMM");
	}

}
