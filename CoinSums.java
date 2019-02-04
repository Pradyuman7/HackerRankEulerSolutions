import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int target = 100000;
        BigInteger[] ways = new BigInteger[target+1];
        
        for(int i=0;i<ways.length;i++) 
          ways[i] = BigInteger.valueOf(0);
        
        ways[0] = BigInteger.valueOf(1);

        int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
        for (int i = 0; i < coinSizes.length; i++) {
            for (int j = coinSizes[i]; j <= target; j++) {
                ways[j] = ways[j].add(ways[j - coinSizes[i]]);
            }
        }
        
        for(int k=0;k<numberOfTestCases;k++) {
            int n = scanner.nextInt();
            System.out.println(ways[n].mod(BigInteger.valueOf(1000000007)));
        }
        
        scanner.close();
    }
}
