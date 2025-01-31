package classe;

// Mother class
public abstract class Vehicule {
	// Attributes
	private String name;
	private String model;
	private int price;
	
	// Constructor
	Vehicule(String name, String modele, int price) {
		this.name = name;
		this.model = modele;
		this.price = price;
	}
	
	// Methods - getters
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	// Methods - setters
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	// Methods
	void forward() {
		System.out.println("I'm moving forward");
	}
	
	void backward() {
		System.out.println("I'm moving backward");
	}
	
	// abstract method
	abstract void noise();
	
	
}	
