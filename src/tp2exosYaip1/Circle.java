package tp2exosYaip1;

public class Circle {
	
	public static void main(String[] args) {
		Circle myCircle = new Circle(5);
		System.out.println(myCircle.getArea());
	}
	
	// Attributes
	private double radius = 1.0;
	private String color = "red";
	
	// Principal constructor
	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// Secondary constructor
	Circle(double radius) {
		this.radius = radius;
	}
	
	// Methods
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
