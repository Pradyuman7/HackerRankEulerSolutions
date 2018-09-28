import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
		int n = scan.nextInt();
        int k = scan.nextInt();
        String num = scan.next();
        int product=1;
        int max=0;
        int i,j;
        for(i=0;i<n-k;i++) {
        	for(j=0;j<k;j++)
        		
        	{   
        		char ch = num.charAt(i+j);
        		int m = Integer.parseInt(String.valueOf(ch));
        		product=product*m;
        	}
        	if(product>=max)
        		max=product;
        	product=1;
        }
        System.out.println(""+max);
        }
        scan.close();
	}

}
