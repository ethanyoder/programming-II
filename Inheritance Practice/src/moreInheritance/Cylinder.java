//Ethan Yoder
//March 1, 2016
//Purpose: To hold information and make calculations about cylinders

package moreInheritance;

public class Cylinder extends Circle {

	//declares attributes
	private double height;
	
	//creates constructor methods
	public Cylinder(double x, double y, double radius, double height) {
		super(x, y, radius);
		this.height = height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void volume() {
		System.out.println("Volume: " + (height * (Math.PI * Math.pow(radius, 2))));
	}
	
	public void surface() {
		System.out.println("Surface Area: " + (((Math.PI * Math.pow(radius, 2) * 2)) + (2 * Math.PI * radius * height)));
	}
}
