/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class allSubArray_withTheirSum
{
  public static void allSubArray (int arr[])
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
	allSubArray (arr);
  }
}
