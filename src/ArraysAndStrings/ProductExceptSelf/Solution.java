package ArraysAndStrings.ProductExceptSelf;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 1};
        int result[] = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];

        int prevProd = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prevProd;
            prevProd *= nums[i];
        }
        
        int nextProd = 1;
        for (int j = nums.length-1; j >= 0; j--) {
            result[j] *= nextProd;
            nextProd *= nums[j];
        }

        return result;
    }
}

// public class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int result[] = new int[nums.length];
//         Arrays.fill(result, 1);

//         // int index = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 result[j] *= (i==j) ? 1 : nums[i];
//             }
//         }

//         return result;
//     }
// }