package assignment1;

import java.util.Scanner;

public class Triangle extends GeometricObject{
	private double s1 = 3.0;
	private double s2 = 4.0;
	private double s3 = 5.0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter three sides of the triangle: ");
		GeometricObject triangle = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.print("Please enter color of the triangle: ");
		triangle.setColor(sc.next());
		System.out.print("Please enter filled state of the triangle (true/false): ");
		triangle.setFilled(sc.nextBoolean());
	
		System.out.println(triangle.toString());    
		sc.close();
	
	}
	
	public Triangle() {
		
	}

	public Triangle(double s1, double s2, double s3) {
		
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	@Override 
	public double getPerimeter() {
		return s1+s2+s3;
	}
	
	@Override 
	public double getArea() {
		double s = (s1+s2+s3)/2;
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
	
	@Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		String NL = System.getProperty("line.separator");
		
		display.append("Triangle: " + NL);
		display.append("        side1 = " + s1 + ", side2 = " + s2 + ", side3 = " + s3 + NL);
		display.append("        color = " + getColor() + NL);
		display.append("        filled = " + isFilled() + NL);
		display.append("        area = " + getArea() + NL);
		display.append("        perimeter = " + getPerimeter());
		
		return display.toString();
	}
}
