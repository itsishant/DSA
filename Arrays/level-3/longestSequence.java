import java.util.*;

public class longestSequence {

    public static int Brute (int arr[], int n ){
        int copy;
        int ans = -1;

        for(int i = 0; i<n; i++){
            int a = arr[i];
            int cnt = 0;
            
            for(int j = i+1; j<n; j++){
                a++;
                copy = a;

                if( arr[j] == copy){
                    cnt ++;
                }

                ans = Math.max(cnt, ans);
            }
        }o
        return ans;
k
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Brute(arr, n));

    }
}
