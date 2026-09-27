//missingNumber leetcode problem number 268
public class Seven {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = new Seven().missingNumber(nums);    
    System.out.println("Missing number is: " + missingNumber);
    }   
        public int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }

    public void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
