// Remove Element 27

import java.util.Arrays;


public class Twelve {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        int length = new Twelve().removeElement(nums, val);

        System.out.print("Length after removing element: " + length+" and the modified array is: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
