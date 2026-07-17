package Logic;

public class missingNumberLc {
    
    public static void main(String[] args) {
        int n = 0;
        int [] arr = {3, 0 , 1};

        for (int i = 0; i<arr.length; i++) {
            n = n ^ i;
            n = n ^ arr[i];
        }
        return n^arr.length;
    }
}
