//90. Word Pattern
import java.util.HashMap;
import java.util.Map;
public class TwentyEight {
    
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean result = new TwentyEight().wordPattern(pattern, str);
        System.out.println("Does the string follow the pattern? " + result);
    }

    private boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }
}
