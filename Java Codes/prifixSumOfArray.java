/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class prifixSumOfArray
{
    public static void prifixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prifixS[] = new int[arr.length];
        prifixS[0] = arr[0];
        
        for (int i = 1; i<arr.length ; i++ ){
            prifixS[i] = prifixS[i-1] + arr[i];
        } 
        for (int i = 0; i<arr.length ; i++ ){
            for (int j=i; j<arr.length ; j++ ){
                currSum = i == 0? prifixS[j] : prifixS[j] - prifixS[i -1];
            } 
                if (currSum > maxSum){
                    maxSum = currSum;
                } 
        } 
            System.out.print(maxSum);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1,5,2,7,3,6,8,2,4,1};
		prifixSum(arr);
	}
}
