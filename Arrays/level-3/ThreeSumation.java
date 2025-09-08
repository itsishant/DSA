import java.util.*;

public class ThreeSumation {
    public static ArrayList<Integer> threeSum (int arr[], int n ) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i<n; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j < k) {
            int sum = arr[i] + arr[j] + arr[k];
            
            if( sum < 0) {
                j++;
            } else if(sum > 0) {
                k--;

            } else{ 
                ans.add(arr[i]);
                ans.add(arr[j]);
                ans.add(arr[k]);
                k++;
                j--;
                while ( j<k && arr[j] == arr[j-1]) j++;
                while ( j<k && arr[k] == arr[k+1]) k--;
            }
                    
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(threeSum(arr, n));
        sc.close();
    }
}
