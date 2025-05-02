package ArraysAndStrings.ClosestNumberToZero;

// https://leetcode.com/problems/find-closest-number-to-zero/
public class Solution {
    public int findClosestNumber(int[] nums) {
        int best = nums[0];
        for (int num: nums) {
            if (Math.abs(num) < Math.abs(best)) {
                best = num;
            }
            else if (Math.abs(num) == Math.abs(best) && num >= best) {
                best = num;
            }
        }
        return best;
    }
}