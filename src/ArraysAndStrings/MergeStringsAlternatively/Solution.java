package ArraysAndStrings.MergeStringsAlternatively;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder result = new StringBuilder();
        while (left < word1.length() && right < word2.length()) {
            int index = result.length() % 2;

            if (index == 0) {
                result.append(word1.charAt(left++));
            }
            else {
                result.append(word2.charAt(right++));
            }
        }

        while (left < word1.length()) {
            result.append(word1.charAt(left++));
        }
        while (right < word2.length()) {
            result.append(word2.charAt(right++));
        }

        return result.toString();
    }
}
