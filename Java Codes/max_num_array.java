
public class max_num_array {
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
         for(int i=0; i<arr.length; i++){
            if (largest < arr[i]) {
                largest = arr[i];

            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest value in the array is :"+ smallest);               
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {34,64,25,85,34,65,96,3,23,};
        int largeNum = largestNum(arr);
        System.out.println("The largest value in the array is:"+largeNum);
    }

}
