package Logic;

public class conutDigits {
    public static void main (String[] args) {
        int cnt = 0;
        int digit = 254;

        if (digit == 0) {
            System.out.println(1);
        }

        // change this number to -ve numebr to +ve number
        digit = Math.abs(digit);

        while (digit > 0 && digit != 0) {
            digit = Math.floor(digit/10);
            cnt++;
        }
    }
}
