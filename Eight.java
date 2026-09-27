//Single Number leetcode problem number 136
public class Eight {
    public static void main(String[] args){
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = new Eight().singleNumber(nums);
        System.out.println("Single number is: " + singleNumber);
    }
        public int singleNumber(int[] nums) {
                int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}
