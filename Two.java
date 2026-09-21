import java.util.HashSet;

public class Two {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       boolean result = new Two().containsDuplicate(arr);
       System.out.println("Contains duplicate: " + result);
    }
        public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        return set.size() != nums.length;
    }

}
