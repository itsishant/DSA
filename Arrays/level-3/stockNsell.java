import java.util.Scanner;
public class stockNsell {
    public static int Optimal (int arr[], int n){
        int profit = 0;
        int min = arr[0];

        for(int i = 0; i<n; i++){
            int gross = arr[i] - min;
            profit = Math.max(profit, gross);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Optimal(arr, n));
    }
}
