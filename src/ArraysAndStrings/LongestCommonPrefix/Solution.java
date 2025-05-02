public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = 0;

        while (length < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= length) {
                    return strs[0].substring(0, length);
                }
                
                if (strs[i].charAt(length) != strs[0].charAt(length)) {
                    return strs[0].substring(0, length);
                }
            }
            length++;
        }

        return strs[0];
    }
}