//Ethan Yoder
//January 29, 2016
//Purpose: To solve 5 problems found on the Internet

public class FiveProblems {

	public static void main(String[] args) {
		
		//first problem
		int[] one = {2,3,5,4,7,35,2,6,8,9};
		double sum = 0;
		int j = 0;
		
		for (int i = 0; i < one.length; i++)
		{
			sum += one[i];
		}
		System.out.println(sum);
		sum = 0;
		while(j < one.length)
		{
			sum += one[j];
			j++;
		}
		System.out.println(sum);
		
		//second problem
		int[] listOne = {1,3,5};
		int[] listTwo = {2,4,6};
		int[] combined = new int[6];
		for (int k = 0, l = 0; k < listOne.length; k++, l += 2)
		{
			combined[l] = listOne[k];
			combined[l + 1] = listTwo[k];
		}
		for (int m = 0; m < combined.length; m++)
			System.out.print(combined[m] + ",");
	}
}
