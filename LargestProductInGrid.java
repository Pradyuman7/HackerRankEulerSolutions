import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int result=0;
        for(int i=0; i < 20; i++){
            for(int j=0; j < 20; j++){
                
                int tempRow =0;
                if(j+1<20 && j+2<20 && j+3<20)
                    tempRow = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                if(tempRow>result)
                    result=tempRow;
                
                int tempColumn =0;
                if(i+1<5&& i+2<20 && i+3<20)
                    tempColumn = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                if(tempColumn>result)
                    result=tempColumn;
                
               
                int tempDiagonal=0;
                if(i+1<20 && i+2<20 && i+3<20 && j+1<20 && j+2<20 && j+3<20)
                    tempDiagonal = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if(tempDiagonal>result)
                    result=tempDiagonal;
                
                
                int tempRightDiagonal=0;
                if(i+1<20 && i+2<20 && i+3<20 && j-1>=00 && j-2>=0 && j-3>=0)
                    tempRightDiagonal = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                if(tempRightDiagonal>result)
                    result=tempRightDiagonal;
                
            }
        }
        System.out.print(result);
    }
}
