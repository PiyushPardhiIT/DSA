//387. First Unique Character in a String
public class TwentySix {
    
    public static void main(String[] args) {
        String s = "leetcode";
        int index = new TwentySix().firstUniqChar(s);
        System.out.println("Index of first unique character: " + index);
    }

    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // Return -1 if there is no unique character
    }
}
