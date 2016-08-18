//Ethan Yoder
//March 1, 2016
//Purpose: To store information about a coordinate point

package moreInheritance;

public class Point {

	//declares attributes
	protected double x;
	protected double y;
	
	//creates constructor method
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public void printCoord() {
		System.out.println("X: " + x + "  Y: " + y);
	}
}
