import java.util.*;

public class linearSearch {
    public static int Linear(int arr[], int targert, int n){
        for(int i = 0; i< n; i++){
            if(arr[i] == targert){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,1,4,6};
        int n = arr.length;
        System.out.print("Enter the targert value: ");
        int targert = sc.nextInt();
        
        System.out.println("Target index is: "+ Linear(arr, targert, n));
    }
}
