//283 Move Zeroes

import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new Six().moveZeroes(nums);
        System.out.print("Array after moving zeroes: "+ Arrays.toString(nums));
    }

  public void moveZeroes(int[] nums) {

        int insertPos = 0;

        // Put every non-zero element at the next available position.
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill all remaining positions with zero.
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
