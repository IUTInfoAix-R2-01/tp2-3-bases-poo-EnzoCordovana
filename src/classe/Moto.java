package classe;

public class Moto extends Vehicule {

	// Constructor
	Moto(String name, String modele, int price) {
		super(name, modele, price);
	}

	@Override
	void noise() {
		System.out.println("NNIIOOOONNNNNNN");
	}	
}
