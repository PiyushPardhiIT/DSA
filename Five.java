//169 Majority Element    

import java.util.HashMap;

public class Five {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = new Five().majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
     public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            // If num already exists, increase its count.
            // Otherwise, start its count at 1.
            map.put(num, map.getOrDefault(num, 0) + 1);

            // If this number appears more than half of the array,
            // it is the majority element.
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }
}
