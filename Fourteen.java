// 977 Sorted Squares of a Sorted Array
public class Fourteen {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        int[] result = new Fourteen().sortedSquares(nums);

        System.out.print("Sorted squares: " + java.util.Arrays.toString(result));
    }
   
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}

