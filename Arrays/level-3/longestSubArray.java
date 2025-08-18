import java.util.*;
public class longestSubArray{

    public static int brute (int arr[], int n, int value){

        // main logic  TC = O(n^3) SC = O(1)
        int length = 1;
        int maxi = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int s = 0;
                for(int k = i; k<=j; k++){
                    s += arr[k];

                    if(s == value) maxi = Math.max(length, j-i+1); 
                }
            }
            
        }
        return maxi;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the value : ");
            int value;
            value = sc.nextInt();

            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("The length is: ");
            System.out.println(brute(arr, n, value));
    }
}