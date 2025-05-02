package ArraysAndStrings;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader reader = new FastReader();
        FastWriter writer = new FastWriter();
        int t = reader.readSingleInt();
        ArrayList<Integer> numbers = reader.readIntArrayList(t);
        boolean check = false;
        while (t-- > 0) {

        }
    }

    // Function to sort map by Key
    public static void mapSortByKey(Map<Integer, Integer> map) {
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        // Display the TreeMap which is naturally sorted
        for (Integer x : sortedKeys)
            System.out.println("Key = " + x
                    + ", Value = " + map.get(x));
    }

    public static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i - 1) > arr.get(i)) return false;
        return true;
    }

    public static boolean isSortedReverse(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i - 1) > arr.get(i)) return false;
        return true;
    }

    public static class FastReader {

        // Reader object
        BufferedReader reader;

        // Constructor
        public FastReader() {
            // Initialize the reader
            reader = new BufferedReader(new InputStreamReader(System.in));
            if (System.getProperty("ONLINE_JUDGE") == null) {
                try {
                    reader = new BufferedReader(new InputStreamReader(System.in));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // String tokenizer
        StringTokenizer tokenizer;

        // Function to read a single integer
        public int readSingleInt() throws IOException {
            return Integer.parseInt(reader.readLine());
        }

        // Function to read a single long
        public long readSingleLong() throws IOException {
            return Long.parseLong(reader.readLine());
        }

        // Function to read an Array of numInts integers in one line
        public int[] readIntArray(int numInts) throws IOException {
            int[] nums = new int[numInts];
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < numInts; i++) {
                nums[i] = Integer.parseInt(tokenizer.nextToken());
            }
            return nums;
        }

        // Function to read an ArrayList of numInts integers in one line
        public ArrayList<Integer> readIntArrayList(int numInts) throws IOException {
            ArrayList<Integer> nums = new ArrayList<>();
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < numInts; i++) {
                nums.add(Integer.parseInt(tokenizer.nextToken()));
            }
            return nums;
        }

        // Function to read an ArrayList of numLongs Longs in one line
        public ArrayList<Long> readLongArrayList(Long numLongs) throws IOException {
            ArrayList<Long> nums = new ArrayList<>();
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < numLongs; i++) {
                nums.add(Long.parseLong(tokenizer.nextToken()));
            }
            return nums;
        }

        // Function to read an Set of numInts integers in one line
        public Set<Integer> readIntSet(int numInts) throws IOException {
            Set<Integer> nums = new HashSet<>();
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < numInts; i++) {
                nums.add(Integer.parseInt(tokenizer.nextToken()));
            }
            return nums;
        }

        // Function to read string
        public String readString() throws IOException {
            return reader.readLine();
        }

    }

    // Fast Writer Class
    public static class FastWriter {
        // Writer object
        BufferedWriter writer;

        // Constructor
        public FastWriter() {
            // Initialize the writer
            writer = new BufferedWriter(new OutputStreamWriter(System.out));
            if (System.getProperty("ONLINE_JUDGE") == null) {
                try {
                    writer = new BufferedWriter(new OutputStreamWriter(System.out));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // Function to write the single integer
        public void writeSingleInteger(int i) throws IOException {
            writer.write(Integer.toString(i));
            writer.newLine();
            writer.flush();
        }

        // Function to write single long
        public void writeSingleLong(long i) throws IOException {
            writer.write(Long.toString(i));
            writer.newLine();
            writer.flush();
        }

        // Function to write a Integer of array with spaces in one line
        public void writeIntArrayWithSpaces(int[] nums) throws IOException {
            for (int num : nums) {
                writer.write(num + " ");
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write a Integer of array with spaces in one line
        public void writeIntArrayListWithSpaces(ArrayList<Integer> nums) throws IOException {
            for (Integer num : nums) {
                writer.write(num + " ");
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write a Integer of array with spaces in one line
        public void writeLongArrayListWithSpaces(ArrayList<Long> nums) throws IOException {
            for (Long num : nums) {
                writer.write(num + " ");
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write Integer of array without spaces in 1 line
        public void writeIntArrayWithoutSpaces(int[] nums) throws IOException {
            for (int num : nums) {
                writer.write(Integer.toString(num));
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write Integer of ArrayList without spaces in 1 line
        public void writeIntArrayWithoutSpaces(ArrayList<Integer> nums) throws IOException {
            for (Integer num : nums) {
                writer.write(Integer.toString(num));
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write Long of ArrayList without spaces in 1 line
        public void writeLongArrayWithoutSpaces(ArrayList<Long> nums) throws IOException {
            for (Long num : nums) {
                writer.write(Long.toString(num));
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write String
        public void writeString(String s) throws IOException {
            writer.write(s);
            writer.flush();
        }
    }

    //    Pair
    private static class Pair implements Comparable<Pair> {
        int firstNum;
        int secondNum;

        public int getFirstNum() {
            return firstNum;
        }

        public void setFirstNum(int firstNum) {
            this.firstNum = firstNum;
        }

        public int getSecondNum() {
            return secondNum;
        }

        public void setSecondNum(int secondNum) {
            this.secondNum = secondNum;
        }

        public Pair(int firstNum, int secondNum) {
            this.firstNum = firstNum;
            this.secondNum = secondNum;
        }

        @Override
        public int compareTo(Pair o) {
            if (firstNum == o.firstNum) return 0;
            else if (firstNum > o.firstNum) return 1;
            else return -1;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair pair = (Pair) obj;
            return firstNum == pair.firstNum && secondNum == pair.secondNum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstNum, secondNum);
        }
    }

    // Function to find x ^ n using p as mod
    public static long power(long x, long y, long p) {
        // Initialize result
        long res = 1;
        // Update x if it is more than or equal to p
        x = x % p;
        while (y > 0) {
            // If y is odd, multiply x with result
            if (y % 2 == 1)
                res = (res * x) % p;
            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }

    // Function to implement the modular arithmetic addition
    private static long modularAddition(long a, long b) {
        final int mod = 1000000007;
        return ((a % mod) + (b % mod)) % mod;
    }

    // Function to implement the modular arithmetic subtraction
    private static long modularSubtraction(long a, long b) {
        final int mod = 1000000007;
        return ((a % mod) - (b % mod) + mod) % mod;
    }

    // Function to implement the modular arithmetic multiplication
    private static long modularMultiplication(long a, long b) {
        final int mod = 1000000007;
        return ((a % mod) * (b % mod)) % mod;
    }

    public static long lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}