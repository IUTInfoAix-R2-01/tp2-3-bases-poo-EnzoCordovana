package YAIP;

public class MyComplex {
	// Attributes
	private double real = 0.0;
	private double imag = 0.0;
	
	MyComplex() {
		
	}
	/*
	 * @param reel		The imaginary side
	 * @param imag		The real side
	*/
	MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	/*
	 * @return real		The real side
	*/
	public double getReal() { // getter
		return this.real;
	}
	
	/*
	 * @param newReal	The new real value
	 * @return void 
	*/
	public void setReal(double real) { // setter
		this.real = real;
	}
	
	/*
	 * @return imag		The imaginary side
	*/
	public double getImag() { // getter
		return this.imag;
	}
	
	/*
	 * @param newImag	The new imaginary value
	 * @return void 
	*/
	public void setImag(double imag) { // setter
		this.imag = imag;
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
	@Override
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
	 * @param another		Other complex
	 * @return boolean
	*/
	public boolean equals(MyComplex another) {
		return this.real == another.real && this.imag == another.imag;
	}
	
	/*
	 * @return double 
	*/
	public double magnitude() {
		return Math.sqrt((this.imag * this.imag) + (this.real * this.real));
	}
	
	public MyComplex addInto(MyComplex right) {
		right.setValue(this.real + right.getReal(), this.imag + right.getImag());
		return right;
	}
	
	public MyComplex addNew(MyComplex right) {
		return new MyComplex((this.real + right.getReal()),(this.imag + right.getImag()));
	}
	
}
