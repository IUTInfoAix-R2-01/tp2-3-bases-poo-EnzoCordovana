package YAIP;

public class MyComplex {
	// Attributes
	private double real = 0.0;
	private double imag = 0.0;
	
	/*
	 * @param reel		The imaginary side
	 * @param imag		The real side
	*/
	MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	// Methods
	/*
	 * @return real		The real side
	*/
	public double getReal() { // getter
		return real;
	}
	
	/*
	 * @param newReal	The new real value
	 * @return void 
	*/
	public void setReal(double newReal) { // setter
		this.real = newReal;
	}
	
	/*
	 * @return imag		The imaginary side
	*/
	public double getImag() { // getter
		return imag;
	}
	
	/*
	 * @param newImag	The new imaginary value
	 * @return void 
	*/
	public void setImag(double newImag) { // setter
		this.imag = newImag;
	}
	
	/*
	 * @param real		Change the value by the new value;
	 * @param imag		Change the value by the new value;
	 * @return void 
	*/
	public void setValue(double real, double imag) { // setter
		this.real = real;
		this.imag = imag;
	}
	
	/*
	 * @return String	Return all attributes
	*/
	public String toString() {
		return "real + imag : " + real + "+" + imag + "i"; 
	}
	
	/*
	 * @return boolean
	*/
	public boolean isReal() {
		 return this.imag == 0 ? true : false;
	}
	
	/*
	 * @return boolean 
	*/
	public boolean isImaginary() {
		return this.real == 0 ? true : false;
	}
	
	/*
	 * @param real
	 * @param imag
	 * @return boolean 
	*/
	public boolean equals(double real, double imag) {
		return this.real == real && this.imag == imag ? true : false;
	}
	
	/*
	 * @return double 
	*/
	public double magnitude() {
		return Math.sqrt((this.imag * this.imag) + (this.real * this.real));
	}
	
	public MyComplex addInto(MyComplex right) {
		return null;
	}
	
	public MyComplex addNew(MyComplex right) {
		return null;
	}
	
}
