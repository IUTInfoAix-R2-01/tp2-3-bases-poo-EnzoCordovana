package Prof;

public class Personne {
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
				: "Prénom: " + prenom;
	}
}
