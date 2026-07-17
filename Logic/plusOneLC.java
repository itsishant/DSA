package Logic;

public class plusOneLC {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int n = arr.length;

        for (int i = n-1; i>=0; i--) {
            int q = arr[i];
            q++;
            
            if (q <= 9) {
                arr[i] = q;
                return arr;
            }
            else {
                arr[i] = 0;
            }
        }

        int[] ans = new int[n+1];
        ans[0] = 1;
    }
}
