//485. Max Consecutive Ones
public class Eighteen {
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int result= new Eighteen().findMaxConsecutiveOnes(nums);
        System.err.println(result);
    }
   
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}

