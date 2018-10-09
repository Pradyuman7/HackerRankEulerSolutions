import java.io.*;
import java.util.*;

public class Solution {
    
private static final String STR = "abcdefghijklm";
private static final long[] FACT = { 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };

private static String lexicographicPermutation(long n) {
    n--;
    char[] arr = STR.toCharArray();

    for (int i = 0; i < arr.length - 1; ++i) {
        long fact = FACT[arr.length - i - 2];
        long p = i + n / fact;

        n %= fact;

        for (int j = i + 1; j <= p; ++j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    return new String(arr);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-->0){
            long n = scanner.nextLong();
            System.out.println(lexicographicPermutation(n));
        }
    }
}
