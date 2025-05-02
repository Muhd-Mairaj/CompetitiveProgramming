public class Solution {
    public static void main(String[] args) {
        // String dominoes = "RR.L";
        // String dominoes = ".L.R...LR..L..";
        String dominoes = "R.R.L";

        Solution solution = new Solution();
        System.out.println(solution.pushDominoes(dominoes));
    }

    public String pushDominoes(String dominoes) {
        char[] input = dominoes.toCharArray();
        char[] output = new char[dominoes.length()];

        int index = 0;
        for (int i = 1; i < input.length; i++) {  
            if (input[i] == 'L') {
                switch (input[index]) {
                    case 'L', '.' -> {
                        for (; index < i; index++) {
                            output[index] = 'L';
                        }
                    }
                    case 'R' -> {
                        int gap = i - index - 1;

                        output[index++] = 'R';
                        
                        for (int temp = 0; temp < gap/2 && index < i; temp++) {
                            output[index++] = 'R';
                        }

                        if (gap % 2 == 1) {
                            output[index++] = '.';
                        }

                        for (int temp = 0; temp < gap/2 && index < i; temp++) {
                            output[index++] = 'L';
                        }
                    }
                    default -> throw new AssertionError();
                }
            }
            else if (input[i] == 'R') {
                int last = index;
                for (; index < i; index++) {
                    output[index] = (input[last] == 'R') ? 'R' : input[index];
                }
            }
        }

        // Handle the last segment
        int last = index;
        for (; index < input.length; index++) {
            output[index] = (input[last] == 'R') ? 'R' : input[index];
        }

        return String.valueOf(output);
    }
}