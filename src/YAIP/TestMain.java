package YAIP;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		String test;
		
		MyComplex myComplex1 = new MyComplex(1.1, 2.2);
		MyComplex myComplex2 = new MyComplex(3.3, 4.4);
		
	//	Scanner scanner = new Scanner(System.in);
  		
		//System.out.print("Enter complex number 1 (real and imaginary part): ");
  		//test = scanner.nextLine();
  		
  		//System.out.println(test);
  		
  		
  		//System.out.print("Enter complex number 2 (real and imaginary part): ");
  		//scanner.close();
		
		
		System.out.println(myComplex2.equals(myComplex1));
	}
}
