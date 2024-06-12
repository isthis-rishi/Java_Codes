/******************************************************************************
This is the code to print all Sub arrays sum of the array.
Just change the array and call printSumAllSubArrays method to print all the subArrays sum.
It it is very useful Array algorithm.
*******************************************************************************/

public class allSubArray_withTheirSum
{
  public static void printSumAllSubArrays (int arr[])
  {
	for (int i = 0; i < arr.length; i++)
	  {
		for (int j = i; j < arr.length; j++)
		  {
			int sum = 0;
			for (int k = i; k <= j; k++)
			  {
				System.out.print (arr[k] + " ");
				sum += arr[k];
			  }
			System.out.print ("= " + sum);
			System.out.println ();
		  }
		System.out.println ();

	  }
  }
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	int arr[] = { 1, 2, 3, 4, 5, 6 };
	printSumAllSubArrays (arr);
  }
}
