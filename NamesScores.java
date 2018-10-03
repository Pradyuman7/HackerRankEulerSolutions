import java.io.*;
import java.util.*;

public class Solution {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        int i=0;
        while(n-->0)
        {
            arr[i++]=sc.nextLine();
        }
        int j=i;
        Arrays.sort(arr);
        int q=sc.nextInt();
        sc.nextLine();
        String arr2[]=new String[q];
        i=0;
        while(q-->0)
        {
            arr2[i]=sc.nextLine();
            for(int k=0;k<j;k++)
            {
                if(arr2[i].equals(arr[k]))
                {
                    int sum=0;
                    char str[]=arr2[i].toCharArray();
                    for(int l=0;l<str.length;l++)
                    {
                     sum+=str[l]-64;   
                    }
                    sum*=(k+1);
                    System.out.println(sum);
                }
            }
            i++;
        }
    }
}
