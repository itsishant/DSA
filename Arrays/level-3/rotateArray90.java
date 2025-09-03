import java.util.*;

// The matrix is of N*N

public class rotateArray90 {

    public static void Brute(int arr[][], int n, int m) {
        int[][] ans = new int [n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                ans[j][n-1-i] = arr[i][j];
            }
        }

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
    
        int n = sc.nextInt();
        
        int[][] arr = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Brute(arr, n, n);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
