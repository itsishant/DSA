import java.util.*;
public class MajorityElement {

    public static int Brute (int arr[], int n){
        int repeat, i, j, cnt;
        int value = 0;
        repeat = 0;
        for( i = 0; i<n; i++){
            value = arr[i];
            cnt = 1;
            for( j = i+1; j<n; j++){

                if (value == arr[j]){
                    cnt++;
                    repeat = Math.max(repeat, cnt);
                }
            }
            if (cnt > n/2){
                return value;
            }
        }
        return -1;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Brute(arr, n));
    }
}
