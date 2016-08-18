//Ethan Yoder
//January 21, 2016
//Calculates the area of a circle, cylinder, and rectangle

import java.util.*;

public class Area {

	public static void main(String[] args)
	{

		//declare variables and Scanner object
		double radius;
		double width;
		double length;
		double height;
		int i = 1;
		Scanner console = new Scanner(System.in);
		
		//asks user which calculation they would like done
		while (i != 0)
		{
			System.out.println("We can calculate the area of a circle, cylinder, or rectangle");
			System.out.println("Enter 1 for circle, 2 for rectangle, 3 for cylinder, and 0 to quit");
			switch (console.nextInt())
			{
			case 1 :
				System.out.println("Enter the radius:");
				System.out.println("Area of the circle is " + Area(console.nextDouble()));
				break;
			case 2 :
				System.out.println("Enter the width and length, respectively:");
				System.out.println("Area of the rectanglge is " + Area(console.nextDouble(), console.nextDouble()));
				break;
			case 3 :
				System.out.println("Enter radius and height, respectively:");
				System.out.println("Area of the cylinder is " + Area(console.nextDouble(), console.nextDouble(), Math.PI));
				break;
			case 0 :
				System.exit(0);
			}
		}
		
	}
	
	public static double Area(double radius)
	{
		return (Math.pow(radius, 2) * Math.PI);
	}
	
	public static double Area(double width, double length)
	{
		return width * length;
	}
	
	public static double Area(double radius, double height, double pi)
	{
		return (Math.pow(radius, 2) * pi * height);
	}
}
