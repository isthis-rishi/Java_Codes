
public class repeatedNum_ArrayA1
{
    public static boolean repeatedNum(int arr[]){
        int counter = 1;
        boolean istrue = false;
        for (int i = 0;i<arr.length ;i++ ){
            for (int j = i+1; j<arr.length ;j++ ){
                if (arr[i] == arr[j]){
                    counter++;
                } 
                if (counter >= 2){
                    istrue = true;
                } 
            } 
            
        } 
        return istrue ;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.print(repeatedNum(arr));
	}
}
