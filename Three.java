public class Three {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = new Three().isAnagram(s, t);
        System.out.println("Are the two strings anagrams? " + result);
    }         
        public boolean isAnagram(String s, String t) {

        // Anagrams must contain exactly the same number of characters.
        // If their lengths are different, they cannot be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array of size 26 because there are 26 lowercase
        // English letters: a, b, c, ..., z.
        //
        // Index mapping:
        // 0  -> 'a'
        // 1  -> 'b'
        // 2  -> 'c'
        // ...
        // 25 -> 'z'
        //
        // Initially every frequency is 0.
        int[] count = new int[26];

        // Traverse both strings at the same time.
        for (int i = 0; i < s.length(); i++) {

            // s.charAt(i) gives the current character from s.
            //
            // We subtract 'a' to convert the character into an
            // array index.
            //
            // Example:
            // 'a' - 'a' = 0
            // 'b' - 'a' = 1
            // 'c' - 'a' = 2
            //
            // So if the current character is 'c':
            // count['c' - 'a']++
            // becomes:
            // count[2]++
            //
            // We INCREMENT because this character exists in s.
            count[s.charAt(i) - 'a']++;

            // Now process the corresponding character from t.
            //
            // We DECREMENT because we want the characters from s
            // and t to cancel each other out.
            //
            // If both strings contain the same number of a character,
            // its final count will be 0.
            count[t.charAt(i) - 'a']--;
        }

        // Check every character's final count.
        //
        // If all values are 0:
        //     s and t contain exactly the same characters
        //     with exactly the same frequencies.
        //
        // Therefore they are anagrams.
        for (int num : count) {

            // A non-zero value means that some character appeared
            // more times in one string than in the other.
            if (num != 0) {
                return false;
            }
        }

        // Every character frequency matched.
        return true;
    }
  
}
