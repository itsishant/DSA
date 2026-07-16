package Logic;

public class consecutive {
    public static void main(String[] args) {
        int [] num1 = {1,1,0,1,1,1};

        int n = num1.length;
        int cnt = 0;
        int maxCnt = 0;

        for (int i = 0; i<n; i++) {
            if (num1[i] == 1) {
                cnt++;
            }
            else {
                maxCnt = Math.max(cnt, maxCnt);
                cnt = 0;
            }
        }

        System.out.println("Max cnt ->", Math.max(maxCnt, cnt));
    }
}
