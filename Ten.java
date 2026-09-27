public class Ten {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};   
        int[] result = new Ten().plusOne(digits);

        System.out.print("Result after adding one: " + java.util.Arrays.toString(result));
    }
        public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            // if digit is less than 9
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if digit is 9
            digits[i] = 0;
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
