//Ethan Yoder
//March 1, 2016
//Purpose: To calculate information about a circle

package moreInheritance;

public class Circle extends Point {

	//declares attributes
	protected double radius;
	
	//creates constructor method
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void printRadius() {
		System.out.println("Radius: " + radius);
	}
	
	public void printArea() {
		System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	public void printCircum() {
		System.out.println("Circumference: " + (2 * Math.PI * radius));
	}
}
