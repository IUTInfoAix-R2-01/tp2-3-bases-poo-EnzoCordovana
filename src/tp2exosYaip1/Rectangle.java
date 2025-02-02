package tp2exosYaip1;

public class Rectangle {
	// Attributes
	private float length = 1.0f;
	private float wigth = 1.0f;
	
	// Constructor
	Rectangle(float length, float wigth) {
		this.length = length;
		this.wigth = wigth;
	}
	
	// Methods
	
	/*
	 * @return length		The length of the rectangle
	*/
	public float getLength() {
		return this.length;
	}
	
	/*
	 * @param newLength		The new length of the rectangle
	 * @return void
	*/
	public void setLength(float newLength) {
		this.length = newLength;
	}
	
	
	/*
	 * @return width		The width of the rectangle
	*/
	public float getWidth() {
		return this.wigth;
	}
	
	/*
	 * @param newWidth		The new width of the rectangle
	 * @return void
	*/
	public void setWidth(float newWidth) {
		this.wigth = newWidth;
	}
	
	/*
	 * @return area 		The area of the rectangle
	*/
	public double getArea() {
		return this.wigth * this.length;
	}
	
	/*
	 * @return perimeter	The perimeter of the rectangle
	*/
	public double getPerimeter() {
		return (this.wigth + this.length) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", wigth=" + wigth + "]";
	}
}
