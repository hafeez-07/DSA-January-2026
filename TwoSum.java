
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int nums[], int target) {

        ///brute force

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (target == nums[i] + nums[j]) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }

        //use hashMap to reduce time complexity

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[]{i, map.get(x)};
            } else {
                map.put(cur, i);
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        int[] range = twoSum(nums, target);
        for (int x : range) {
            System.out.print(x + " ");
        }

    }
}
