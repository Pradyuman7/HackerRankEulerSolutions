import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bi;
        int n = sc.nextInt();
        while(n!=0){
            bi = sc.nextInt();
            BigInteger fact = new BigInteger("1");
            BigInteger temp = new BigInteger("1");
            BigInteger sum = new BigInteger("0");
            for(int i=1;i<=bi;i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }  
            while(fact.signum() > 0){
                temp = fact.mod(BigInteger.TEN);
                sum = sum.add(temp);
                fact = fact.divide(BigInteger.TEN);
            }
            System.out.println(sum);
            n--; 
        }
        sc.close();
    }
}
