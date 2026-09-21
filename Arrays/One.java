package Arrays;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = new One().twoSum(arr, target);
        System.out.println("Indices of the two numbers that add up to the target: " + ans[0] + ", " + ans[1]);
    }
   
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

