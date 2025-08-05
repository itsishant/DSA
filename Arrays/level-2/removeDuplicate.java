
import java.util.Scanner;

public class removeDuplicate{

    public static int Remove(int arr[], int n ){
        int i = 0;
        for(int j = 1; j<n; j++){
            if( arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();  
        }

    }
}