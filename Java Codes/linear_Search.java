/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class linear_Search
{
  public static int linearS (int arr[], int key)
  {
	for (int i = 0; i < arr.length; i++)
	  {
		if (key == arr[i])
		  {
			return i;
		  }
	  }
	  return 0;
  }
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	int arr[] = { 34, 6, 4, 25, 34, 2, 74, 75, 23, 85 };
	int n = 74;

	int find = linearS (arr, n);
	System.out.print ("The index of " + n + " is " + find);
  }
}
