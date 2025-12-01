import java.util.*;
public class mergeSort {
    public static void mergeSort(int arr[], int low, int high){
        
        int middle = (high+low)/2;
        if(low<=high) return;

        mergeSort(arr, low, middle);
        mergeSort(arr, middle+1, high);

        
        Merge(arr, low, middle, high);
    }

    public static void Merge(int arr[], int low, int middle, int high){
        int[] temp = new int[arr.length];
        int left = low;
        int right = middle+1;

        while(left<=middle && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= middle){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i = low; i<high; i++){
            arr[i] = temp[i-low];
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        int low = 0;
        int high = arr.length-1;
    }
}
