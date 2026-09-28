//414. Third Maximum Number
import java.util.Arrays;

public class Seventeen {
    public static void main(String[] args){
        int[] nums = {3, 2, 1};
        int result = new Seventeen().thirdMax(nums);

        System.out.print("Third maximum number: " + result);
    }
    //  public int thirdMax(int[] nums) {

    //     Arrays.sort(nums);

    //     int count = 1;

    //     for (int i = nums.length - 2; i >= 0; i--) {

    //         if (nums[i] != nums[i + 1]) {
    //             count++;
    //         }

    //         if (count == 3) {
    //             return nums[i];
    //         }
    //     }

    //     return nums[nums.length - 1];
    // }
     public int thirdMax(int[] nums) {

        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = (long) num;
            }
            else if (num > second) {
                third = second;
                second = (long) num;
            }
            else if (num > third) {
                third = (long) num;
            }
        }

        return third == Long.MIN_VALUE
                ? first.intValue()
                : third.intValue();
    }
}
