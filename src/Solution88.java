public class Solution88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 8, 0, 0, 0};
        int m = 4;
        int[] nums2 = {2, 5, 8};
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length < 1) {
            return;
        }
        int p = m + n - 1;
        int s1 = m - 1;
        int s2 = n - 1;

        while (s2 >= 0) {
            if (nums1[s1] > nums2[s2]) {
                nums1[p--] = nums1[s1--];
            } else {
                nums1[p--] = nums2[s2--];
            }
        }

        for (int k : nums1) {
            System.out.print(k + " ");
        }
    }
}


