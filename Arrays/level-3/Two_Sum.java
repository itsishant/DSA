import java.util.*;

public class Two_Sum {

    public static String Better(int arr[], int n, int target){


        HashMap<Integer, Integer> mapi = new HashMap<>();

        for(int i = 0; i<n; i++){
            int initial = arr[i];
            int more = target - initial;
            if(mapi.containsKey(more)){
                return "YES";
            }
            mapi.put(arr[i], i);
        }
        return "NO";
    }

    public static String brute(int arr[], int n, int target){
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+ arr[j] == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static String Optimal(int arr[], int n, int target){
        // two pointers approcah 

        int left = 0; int right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target) {
                return "YES";
            }

            else if(sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        
        System.out.println(Better(arr, n, target));
        // System.out.println(brute(arr, n, target));
        // System.out.println(Optimal(arr, n, target));
    }
}
