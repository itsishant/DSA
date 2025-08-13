import java.util.Scanner;

public class largestOccurance {

    public static int Largest (int arr[], int n){
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
            else{
                cnt = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Largest(arr, n));
    }
}
