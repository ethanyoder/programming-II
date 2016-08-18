//Ethan Yoder
//February 16, 2016
//Purpose: To create methods that will sort an algorithm based on the bubble and selection algorithms

package sortsearch;

import javax.swing.*;

public class SortAlgorithms {

	public static void main(String[] args) {
		
		//creates the array
		double[] array = {5,8,2,5,2,6,2,7,9,6,3,7,4,7,3};
		
		//prints out sorted array
		for (int i = 0; i < array.length; i++)
			System.out.print(bubble(array)[i] + ", ");

	}
	
	//sorts an algorithm based on the bubble sort algorithm
	public static double[] bubble(double[] nums)
	{
		int first = 1, smallest = 0;
		double[] sorted = new double[nums.length];
		for (int j = 0; j < nums.length; j++)
		{
			for (int i = first; i < nums.length; i++, smallest++)
				if (nums[i] < nums[smallest])
					smallest = i;
			sorted[j] = nums[smallest];
		}
		return sorted;
	}

}
