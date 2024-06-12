/******************************************************************************
This is the code to print all Sub arrays of the array.
Just write change the array and call printAllSubArray method to print all the subArrays.
It it is very useful Array algorithm.
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
