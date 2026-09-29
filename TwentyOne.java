//344. Reverse String
public class TwentyOne {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        new TwentyOne().reverseString(s);
        System.err.println(s);
    }
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
