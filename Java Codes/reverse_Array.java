/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class reverse_Array
{
  public static void reverseA (int arr[])
  {
	int start = 0, end = arr.length - 1;
	while (start < end)
	  {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		start++;
		end--;
	  }
  }

  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
	int n = 12;
    reverseA(arr);
    for (int i = 0;i < arr.length ;i++ ){
	System.out.println (arr[i]);
    } 
  }
}
