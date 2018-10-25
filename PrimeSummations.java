import java.io.*;
import java.util.*;

public class Solution {
private static List<Integer> primeList = new ArrayList<Integer>();

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int tests = s.nextInt();
    populatePrimeList();
    for (int i = 0; i < tests; i++) {
        process(s.nextInt());
    }
}

private static void populatePrimeList() {
    for (int i = 0; i < 1000; i++) {
        if (isPrime(i)) {
            primeList.add(i);
        }
    }
}

private static boolean isPrime(int n) {
    if (n <= 3) {
        return n > 1;
    } else if (n % 2 == 0 || n % 3 == 0) {
        return false;
    } else {
        double sqrtN = Math.floor(Math.sqrt(n));
        for (int i = 5; i <= sqrtN; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

private static void process(int num) {
    System.out.println(count(primeList, findIndex(num), num));
}

private static int findIndex(int num) {
    int i = 0;
    for (;i < primeList.size(); i++) {
        if (primeList.get(i) > num) {
            break;
        }
    }
    return i;
}


private static long count(List<Integer> array, int m, int n) {

   
    long[] currentArray = new long[n+1];
    long[] previousArray = null;
    currentArray[0] = 1;

    for (int i = 0; i < m; i++) {
        for (int j = 1; j < n+1; j++) {
            long x = 0;
            if (j-array.get(i) >= 0) {
                x = currentArray[j-array.get(i)];
            }
            
            long y = 0;
            if (previousArray != null) {
                y = previousArray[j];
            }

            currentArray[j] = x + y;
        }
        previousArray = currentArray;
    }

    return currentArray[n];
}
}
