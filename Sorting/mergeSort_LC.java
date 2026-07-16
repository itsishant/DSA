import java.util.*;

public class mergeSort {
    public static void main (String[] args) {
        // ignore zeros
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {5,6,7};

        int n = nums1.length;
        int m = nums2.length;
        int [] nums1Copy = Arrays.copyOfRange(nums1, 0, m);

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i<m+n; i++) {
            if (p2>=n || (p1<m && nums1Copy[p1] < nums2[p2])) {
                nums1[i] = nums1Copy[p1];
                p1++;
            }
            else {
                nums1[i] = nums2[p2];
                p2++;
            }
        }
    }
}
