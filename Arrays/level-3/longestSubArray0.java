import java.util.*;

public class longestSubArray0 {

    public static ArrayList<Integer> longestSubArrayZero (int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i <n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                if(sum == 0) {
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        
    }
}
