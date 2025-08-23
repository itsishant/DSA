import java.util.Scanner;

public class rearrangeArray {
    public static void Optimal (int arr[], int n, int ans[]){
         int post = 0; int neg = 1;

        for(int i = 0; i<n; i++){
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg += 2;
            }
            else {
                ans[post] = arr[i];
                post += 2;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] ans = new int[n];

        Optimal(arr, n, ans);

        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }
}
