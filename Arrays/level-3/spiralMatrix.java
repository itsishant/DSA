import java.util.*;

public class spiralMatrix {

    public static void Optimal(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        int left = 0;
        int right = m-1;

        int top = 0;
        int bottom = n-1;

        ArrayList<Integer> ans = new ArrayList<>();

        while( left<=right && top<=bottom){

        // left => right
        for(int i = left; i<=right; i++){
            ans.add(arr[top][i]);   
        }
        top++;

        // top => bottom
        for(int i = top; i<=bottom; i++){
            ans.add(arr[i][right]);
        }
        right--;

        // right => left
        if ( top<=bottom ){
        for(int i = right; i>=left; i--){
            ans.add(arr[bottom][i]);
        }
        bottom--;
    }
        // bottom => top
        if( left <= right ) {
        for(int i = bottom; i>=top; i--){
            ans.add(arr[i][left]);
        }
        left++;
    }
    };

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Optimal(arr);

        for(int i = 0; i<ans.size(); i++){
            ans.get(i);
        }
    }
}
