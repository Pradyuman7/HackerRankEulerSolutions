import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(f.readLine());
        
        Long output = (n - 1) * (n - 1);
        
        ArrayList<Integer> lists = new ArrayList<>();
        boolean[] checker = new boolean[200001];
        
        Arrays.fill(checker, true);
        checker[0] = false;
        checker[1] = false;
        
        for(int i = 0; i < checker.length; i++){
            if(checker[i]){
                lists.add(i);
                for(int j = i * i; j < checker.length && j > 0; j*=i){
                    checker[j] = false;
                }
            }
        }
        
        int[] prime = new int[lists.size()];
        
        for(int i = 0; i < prime.length; i++) prime[i] = lists.get(i);
        
        //System.out.println(Arrays.toString(prime));
        
        long num = 0;
        long base = 1;
            
        long largest = prime[0];
        long times = 1;
        while(largest*prime[0] <= n){
            largest *= prime[0];
            times++;
        }
            
        boolean[][] check = new boolean[(int)times + 1][(int)n + 1];
        for(int k = 1; k < check.length; k++){
            for(int j = 1; j < check[0].length; j++){
                if(j != 0 && j != 1) check[k][j] = true;
            }
        }
            
        while(base*prime[0] <= n){
            base *= prime[0];
            num++;
            long cden = num + 1;
            long cbase = base;

            while(cbase*prime[0] <= n){
                cbase *= prime[0];
                //System.out.println(": " + cbase + " " + (int)exp);
                    
                for(int j = 2; cden*j <= num*n; j++){
                    if(cden * j % num == 0)check[(int)cden][j] = false;
                }
                cden++;
            }
                
                
        }
        
        long[] sol = new long[check.length];
        
        for(int i = 1; i < sol.length; i++){
            int cur = 0;
            for(int k = 1; k < check[0].length; k++){
                if(k != 0 && k != 1 && !check[i][k]) sol[i]++;
            }
        }
        
        for(int i = 0; prime[i] <= Math.sqrt(n) + 1; i++){
            long clargest = prime[i];
            int ctimes = 1;
            while(clargest*prime[i] <= n){
                clargest *= prime[i];
                ctimes++;
            }
            
            for(int k = 1; k <= ctimes; k++){
                output -= sol[k];
            }
        }
        
        System.out.println(output);
    }
}
