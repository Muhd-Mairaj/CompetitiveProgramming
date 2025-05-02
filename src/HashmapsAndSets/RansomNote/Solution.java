package HashmapsAndSets.RansomNote;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) {
            return false;
        }

        int[] letterCounts = new int[26];
        for (char letter: magazine.toCharArray()) {
            letterCounts[letter - 'a']++;
        }

        for (char letter: ransomNote.toCharArray()) {
            if (--letterCounts[letter - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
