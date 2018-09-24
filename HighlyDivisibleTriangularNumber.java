import java.io.*;
import java.util.*;

public class Solution {
    static int factor(int a){
        int count=0;
        if(a==1){
            return 1;
        }
        for(int i=1;i<Math.ceil(Math.sqrt(a));i++){
            if(a%i==0){
                count+=2;
            }
        }
        if((Math.ceil(Math.sqrt(a)))==Math.floor(Math.sqrt(a))){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = new int[1001];
        int temp=0,box=0;
        for(int i=1;i<=1000;i++){
            while(temp<=i){
                box++;
                temp=factor(((box)*(box+1))/2);
                
            }
            arr[i]=((box)*(box+1))/2;
        }
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            System.out.println(arr[n]);
        }
    }
}
