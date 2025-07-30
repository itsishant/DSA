import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];

        for(int i = 0; i<n; i++){
            hash[arr[i]]++;
        }

        String s = "aabbcc";

        int [] hashString = new int [26];
        int length = s.length();

        for(int i = 0; i<length; i++){
            hashString[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i<n; i++){
            System.out.println(i+" => "+ hash[i]);
        }

        for(int i = 0; i<length; i++){
            System.out.println( "=> "+ hashString[i]);
        }
    }
}