/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class allSubArray
{
    public static void printAllSubArrays(int arr[]){
        for (int i=0; i<arr.length ; i++ ){
            for (int j =i; j < arr.length ; j++ ){
                for (int k = i; k<=j ; k++ ){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            } 
                System.out.println();
            
        } 
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1,2,3,4,5,6};
		printAllSubArrays(arr);
	}
}
