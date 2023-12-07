import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution189 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,4,5,5,6,7,8};
        int k = 13;
        rotate(nums, k);
    }

    private static void rotate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));

        if (nums == null || nums.length == 0)
            return;

            k %= nums.length;

//        for (int j = 0; j < k; j++) {
//            int tmp = nums[nums.length - 1];
//
//            for (int i = nums.length - 1; i > 0; i--) {
//                nums[i] = nums[i - 1];
//            }
//            nums[0] = tmp;
//        }

        int[] end = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        int[] begin = Arrays.copyOfRange(nums, 0, nums.length - k);;

        for (int i = 0; i < k; i++) {
            nums[i] = end[i];
        }
        for (int i = 0; i < begin.length; i++) {
            nums[i + k] = begin[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
