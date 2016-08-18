//Ethan Yoder
//March 1, 2016
//Purpose: To test the classes

package moreInheritance;

public class Test {

	public static void main(String[] args) {
		
		//tests the Point class
		Point obj = new Point(3, 4);
		System.out.println("X: " + obj.getX() + "   Y: " + obj.getY());
		obj.setX(6);
		obj.setY(8);
		obj.printCoord();
		
		//tests the Circle class
		Circle obj2 = new Circle(5, 5, 6);
		obj2.printRadius();
		obj2.printArea();
		obj2.printCircum();
		
		//tests the Cylinder class
		Cylinder obj3 = new Cylinder(2, 3, 7, 6);
		obj3.setHeight(5);
		obj3.volume();
		obj3.surface();
		
	}

}
