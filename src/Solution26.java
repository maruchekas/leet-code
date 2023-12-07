import java.util.Arrays;

public class Solution26 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,4,4,5,6,6,7};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {

        int k = 1;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
