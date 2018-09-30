import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        List<Integer> solution = getGreater((long) 5000000);
        int t = in.nextInt();
        for(int i = 0; i<t; i++){
            int n = in.nextInt();
            System.out.println(solution.get(n-1));
        }
    }
    
    static List<Integer> getGreater(long n){
        List<Integer> solution = new ArrayList<Integer>();
        List<Integer> Greater = new ArrayList<Integer>();
        int num = 0; 
        int number = 1;
        for(int i = 1; i<=n; i++){
            cont = 0;
            getSequence(i,Greater);
            Greater.add(cont);
            if(cont>=num){
                number = i;
                num = cont;
            }
            solution.add(number);
        }
        return solution;
    }
    
    public static int cont = 0;
    static void getSequence(long n, List<Integer> solution){       
        if(n!=1){
            if(solution.size()>=n){
                cont += solution.get((int) n-1);
            }else{
                if(n%2==0){
                    cont++;
                    getSequence(n/2,solution);
                 }else{
                    cont++;
                    getSequence((3*n)+1,solution);
                 }
            }        
        }
    }
}
