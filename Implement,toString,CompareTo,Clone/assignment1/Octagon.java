package assignment1;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
	@Override
	public int compareTo(Octagon o) {
		if (this.getArea()>o.getArea()) {
			return 1;
		}
		if (this.getArea()<o.getArea()) {
			return -1;
		}
		return 0;
		
	}
	
	private double side = 10.0;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub	
		Octagon octagon = new Octagon(5);	
		Octagon octagonClone = (Octagon) octagon.clone();	
		
		System.out.println("Octagon: Area = " + String.format("%.2f", octagon.getArea()) + ", Perimeter = " + octagon.getPerimeter());
		System.out.println("Are objects equal using == operator? " + (octagon == octagonClone));
		System.out.println("Are objects equal using compareTo method? " + (octagon.compareTo(octagonClone) == 0));
	}
	
	public Octagon() {
		
	}

	public Octagon(double side) {
		this.side = side;

	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2*((1+Math.sqrt(2))*Math.pow(side, 2));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 8;
	}
	
}
