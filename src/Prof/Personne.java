package Prof;

public class Personne {
	public static void main(String[] args) {
		Personne p1 = new Personne("Laurence", "Ago");
		Personne p2 = new Personne("Lolo");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	// Attributes
	private String nom;
	private String prenom;
	
	// Constructor
	/*
	 * @param prenom
	 * @param nom 
	*/
	Personne(String prenom, String nom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/*
	 * @param prenom 
	*/
	Personne(String prenom) {
		this.prenom = prenom;
	}
	
	// Methods
	
	/*
	 * @return nom		Retourne le nom de l'objet
	*/
	public String getNom() {
		return nom;
	}
	
	/*
	 * @return prenom	Retourne le prénom de l'objet
	*/
	public String getPrenom() {
		return prenom;
	}
	
	@Override
	public String toString() {
		return nom != null 
				? "Nom: " + nom + ", Prénom: " + prenom 
				: "Nom: null" + ", Prénom: " + prenom;
	}
}
