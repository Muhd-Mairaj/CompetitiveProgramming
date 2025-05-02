package HashmapsAndSets.ValidAnagram;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] letterCounts = new int[26];
        for (char letter: t.toCharArray()) {
            letterCounts[letter - 'a']++;
        }

        for (char letter: s.toCharArray()) {
            if (--letterCounts[letter - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
