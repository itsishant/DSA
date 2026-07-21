public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 1,2,4,43,5,6};

        int target = 43;
        int i= 0;

        while (i<arr.length) {
            if (arr[i] == target) {
                System.out.println(i);
            }
            i++;
        }
    }
}