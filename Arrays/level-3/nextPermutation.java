import java.util.*;

public class nextPermutation {
    public static void Optimal(int arr[], int n){
        int index = -1;
        int temp;

        for(int i = n-2; i>=0; i--){
            if( arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }


        int start = 0;
        int end = n-1;


         if (index == -1) {
            while( start < end){
                int s1 = arr[start];
                arr[start] = arr[end];
                arr[end] = s1;
                start ++;
                end --;
            }
            return;
        }

        for(int i = n-1; i>index; i--){
            if( arr[i] > arr[index]){
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        
        int left = index+1;
        int right = n-1;

        while (left < right) {
            int rev;
            rev = arr[left];
            arr[left] = arr[right];
            arr[right] = rev;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Optimal(arr, n);

        for(int i  = 0; i<n; i++){
            System.out.print(arr[i] +"  ");
        }
        System.out.println("");
        
    }
}
