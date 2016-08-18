//Ethan Yoder
//February 2, 2016
//Purpose: To organize grades by letter in a 2D array

import java.util.*;

// Accepts grades from user to populate an array of grades

public class ArrayGrader {

	public static void main(String[] args) {
		
		//declares variables and objects
		Scanner keyboard = new Scanner(System.in);
		double current = 300;
		double total = 0;
		
		//get array size from user
		System.out.println("Please enter the number of grades: ");
		int numOfGrades = keyboard.nextInt();
		
		//create 2D array
		double[][] grades = new double[4][numOfGrades];
		for (int h = 0; h < 4; h++)
			Arrays.fill(grades[h], 300.0);
		
		//fills 2D array with grades and organizes them
		for(int i = 0; i < numOfGrades; i++)
		{
			System.out.println("Enter grade: ");
			current = keyboard.nextDouble();
			total += current;
			if (current >= 90)
				grades[0][i] = current;
			else if (current < 90 && current >= 80)
				grades[1][i] = current;
			else if (current < 80 && current >= 70)
				grades[2][i] = current;
			else
				grades[3][i] = current;
		}	
		
		//prints out the average grade
		System.out.println("Average: " + total/numOfGrades);
		
		//prints out the total number of A's, B's, C's, and F's
		System.out.print("A | ");
		for (int j = 0; j < numOfGrades; j++)
			if (grades[0][j] != 300.0)
				System.out.print("*");
		System.out.println();
		
		System.out.print("B | ");
		for (int j = 0; j < numOfGrades; j++)
			if (grades[1][j] != 300.0)
				System.out.print("*");
		System.out.println();
		
		System.out.print("C | ");
		for (int j = 0; j < numOfGrades; j++)
			if (grades[2][j] != 300.0)
				System.out.print("*");
		System.out.println();
		
		System.out.print("F | ");
		for (int j = 0; j < numOfGrades; j++)
			if (grades[3][j] != 300.0)
				System.out.print("*");
		System.out.println();
		}
		
	}

