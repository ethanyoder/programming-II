//Ethan Yoder
//February 16, 2016
//Purpose: To search for values based on the linear and binary search algorithms

package sortsearch;

import java.util.Arrays;
import javax.swing.*;

public class SearchAlgorithms {

	public static void main(String[] args) {
		
		double[] array = {5,8,7,22,3,0,9,1};
		JOptionPane.showMessageDialog(null, "Index of target (linear) : " + linear(array, 4));
		JOptionPane.showMessageDialog(null, "Index of target (binary) : " + binary(array, 4));

	}

	//this method searches for a number value in an array using the linear search algorithm
	public static int linear(double[] nums, double target)
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (target == nums[i])
				return i;
		}
		return -1;
	}
	
	//this method searches for a number value in an array using the binary search algorithm
	public static int binary(double[] nums, double target)
	{
		int min = 0, max = nums.length - 1, spot = (max + min)/2;
		Arrays.sort(nums);
		while (max >= min)
		{
			spot = (max + min) / 2;
			if (nums[spot] == target)
				return spot;
			else if (target > nums[spot])
				min = spot + 1;
			else
				max = spot - 1;
		}
		return -1;
		
	}
}
