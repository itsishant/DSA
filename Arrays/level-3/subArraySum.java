import java.util.*;

public class subArraySum {

    public static int Brute (int arr[], int n ){
        int maxi = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                for(int k = i; k<j; k++){
                    sum += arr[k];
                    maxi = Math.max(sum, maxi);
                }
            }
        }

        return maxi;
    }

    public static int Better (int arr[], int n ){
        int value = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                value = Math.max(value, sum);
            }
        }
        return value;
    }

    public static int Optimal (int arr[], int n ){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            sum += arr[i];

            if (sum > maxi ){
                maxi = sum;
            }

            if (sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Optimal(arr, n));
    }
}
