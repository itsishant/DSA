import java.util.*;

public class four_sum {

    public static ArrayList<Integer> Brute(int arr[], int n, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    for(int l = k+1; l<n; l++){
                        if( arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            ans.add(arr[i]);
                            ans.add(arr[j]);
                            ans.add(arr[k]);
                            ans.add(arr[l]);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static ArrayList<Integer> Better(int arr[], int n, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int k = j+1; k<n; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    int fourth = target - sum;
                    for(i t)
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Brute(arr, n, target));
        sc.close();
    }
}
    