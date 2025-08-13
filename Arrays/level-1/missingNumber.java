import java.util.*;
public class missingNumber {

    public static int Brute (int arr[], int n){
        int i,j;
        for(i = 0; i<=n; i++){
            int flag = 0;
            for(j = 0; j<n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            
        if(flag == 0) return i;
        }
        return -1;
    }

    public static int Optimal (int arr[], int n){
        int sum = n*(n+1)/2;
        int s2 = 0;

        for(int i = 0; i<n ;i++){
            s2+=arr[i];
        }

        return sum-s2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number is " +Brute(arr, n));

        System.out.println("Missing number is " +Optimal(arr, n));
    }
}
