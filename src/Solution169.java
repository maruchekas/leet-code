import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution169 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2,2,2,2,6,6,7};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maj = 1;

        AtomicInteger majorityK = new AtomicInteger();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int x = map.getOrDefault(num, 0) + 1;
            if (x > maj)
                maj = x;
            map.put(num, x);
        }

        int finalMaj = maj;
        map.forEach((k, v) -> {
            if (v == finalMaj) {
                majorityK.set(k);
            }
        });

        return majorityK.get();
    }
}
