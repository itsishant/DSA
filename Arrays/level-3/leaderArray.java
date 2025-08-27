import java.util.*;
public class leaderArray {

    public static int Brute (int arr[], int n ){
        int flag;
        
        for(int i = 0; i<n; i++){
            int a = arr[i];
            flag = 0;

            for(int j = i; j<n; j++){
                if(arr[j] > a){
                    flag++;
                    break;
                }
            }

            if( flag == 0){
                return a;
            }
        }
        return -1;

    }
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Brute(arr, n));
    }
}
