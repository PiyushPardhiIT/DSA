//448. Find All Numbers Disappeared in an Array
import java.util.ArrayList;
import java.util.List;

public class Sixteen {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = new Sixteen().findDisappearedNumbers(nums);

        System.out.print("Disappeared numbers: " + result);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }

        return ans;
    }

    void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
