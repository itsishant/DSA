import java.util.*;
public class selectionSort {

    public static void selectionSort(int arr[] , int n){
        int mini;
        for(int i = 0; i<n-1; i++){
            mini = i;
        for(int j = i; j<n; j++){
            if(arr[j] < arr[mini]){
                mini = j;
            }
        }
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int k = 0; k<n; k++){
            arr[k] = sc.nextInt();
        }
        selectionSort(arr, n);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
}
}