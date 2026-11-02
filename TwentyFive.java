// 383. Ransom Note
public class TwentyFive {
    public static void main(String[] args) {
        TwentyFive solution = new TwentyFive();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean canConstruct = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note: " + canConstruct);
    }

    // This method checks whether every character in ransomNote can be formed
    // using the letters available in magazine.
    //
    // Approach:
    // 1. Count how many times each letter appears in the magazine.
    // 2. Traverse the ransomNote character by character.
    // 3. Decrease the count for that letter.
    // 4. If a count becomes negative, it means that letter is missing,
    //    so we cannot form the ransom note.
    // 5. If all letters are available, return true.
    public boolean canConstruct(String ransomNote, String magazine) {
        // array[0] -> 'a', array[1] -> 'b', ..., array[25] -> 'z'
        int[] count = new int[26];

        // Count all letters in the magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Check each character in ransomNote
        // If we need more of a letter than magazine has, the count goes below 0
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) {
                return false;
            }
        }

        // If every required letter was found, return true
        return true;
    }
}