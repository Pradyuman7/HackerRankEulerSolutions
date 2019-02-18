import java.math.BigInteger;
import java.util.Scanner;

public class Problem57 {
	
	public static void main(String[] args) {
		System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        getAnswer(n);
    }

    private static void getAnswer(int n) {
        BigInteger numerator = BigInteger.valueOf(3);
        BigInteger denominator = BigInteger.valueOf(2);
        for (int i = 0; i < n; i++) {
            // if (numerator.toString().length() > denominator.toString().length()) {
            if (log10(numerator) > log10(denominator)) {
                System.out.println((i + 1));
            }
            BigInteger newDenominator = numerator.add(denominator);
            BigInteger newNumerator = newDenominator.add(denominator);
            numerator = newNumerator;
            denominator = newDenominator;
        }
    }

    private static int log10(BigInteger huge) {
        int digits = 0;
        int bits = huge.bitLength();
        while (bits > 4) {
            int reduce = bits / 4;
            huge = huge.divide(BigInteger.TEN.pow(reduce));
            digits += reduce;
            bits = huge.bitLength();
        }
        if (huge.intValue() > 9) {
            digits += 1;
        }
        return digits;
    }

}
