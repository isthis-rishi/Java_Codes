/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class binary_Search
{
  public static int binaryS (int arr[], int key)
  {
	int start = 0, end = arr.length - 1;
	while (start <= end)
	  {
		int mid = (start + end) / 2;
		
		if (arr[mid] == key)
		  {
			return mid;
		  }
		if (key < arr[mid])
		  {
			end = mid - 1;
		  }
		else
		  {
			start = mid + 1;
		  }
	  }
	return -1;
  }

  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
	int n = 12;

	int find = binaryS (arr, n);
	System.out.print ("The index of " + n + " is " + find);
  }
}
