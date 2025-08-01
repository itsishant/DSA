import java.util.Scanner;

public class bubbleSort {

    public static void bubbleSort(int arr[] ,int n){

        for(int i = 0; i <= n-2 ;i++){
            int stopSorting = 0;
            for(int j = 0; j <= n-2-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    stopSorting = 1;
                }
            } 
            if(stopSorting == 0){
                System.out.println("Stops");
                                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
