package ArraysAndStrings.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });
        
        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        int index = 0;
        
        for (int[] interval: intervals) {
            if (result.get(index)[1] < interval[0]) {
                result.add(interval);
                index++;
            }
            else {
                result.get(index)[1] = Math.max(result.get(index)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
}