//205. Isomorphic Strings
public class TwentySeven {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = new TwentySeven().isIsomorphic(s, t);
        System.out.println("Are the strings isomorphic? " + result);
    }
    private boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS[c1] != mapT[c2]) {
                return false;
            }

            // Mark the characters as seen
            mapS[c1] = i + 1; // Use i + 1 to avoid confusion with default value 0
            mapT[c2] = i + 1;
        }

        return true;
    }
}
