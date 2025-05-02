package ArraysAndStrings.RomanToInteger;

import java.util.Stack;

public class Solution {
    public int romanToInt(String s) {
        char[]  romanNumber = s.toCharArray();
        int prev = 0;
        int result = 0;
        for (char roman: romanNumber) {
            int value = mapping(roman);
            if (prev < value) {
                result = result-prev + value-prev;
            }
            else {
                result = result + value;
            }
            prev = value;
        }

        return result;
//        char[] romanNumber = s.toCharArray();
//        Stack<Integer> stack = new Stack<>();
//
//        for (char roman: romanNumber) {
//            int value = mapping(roman);
//            if (stack.isEmpty()) {
//                stack.push(value);
//            }
//            else if (stack.peek() < value) {
//                stack.push(value - stack.pop());
//            }
//            else {
//                stack.push(value);
//            }
//        }
//
//        int result = 0;
//        while (!stack.isEmpty()) {
//            result += stack.pop();
//        }
//
//        return result;
    }

    public int mapping(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}