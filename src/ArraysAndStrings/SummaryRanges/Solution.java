package ArraysAndStrings.SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int a = 0;
        int b = -1;

        for (int i = 0; i < nums.length; i++) {
            if (b == -1 || nums[i] == nums[b]+1) {
                b = i;
            }
            else {
                if (a == b) {
                    result.add(Integer.toString(nums[b]));
                }
                else {
                    result.add(String.format("%d->%d", nums[a], nums[b]));
                }
                a = b = i;
            }
        }

        if (a == b) {
            result.add(Integer.toString(nums[b]));
        }
        else {
            result.add(String.format("%d->%d", nums[a], nums[b]));
        }

        return result;
    }
}
