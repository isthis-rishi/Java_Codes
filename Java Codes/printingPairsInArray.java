/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class printingPairsInArray
{
    public static void printPairs(int arr[]){
        for (int i = 0 ;i < arr.length ;i++ ) {
            for (int j = i+1; j < arr.length ;j++ ){
                System.out.print("("+ arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {2,4,5,6,7,8,0};
		
		printPairs(arr);
	}
}
