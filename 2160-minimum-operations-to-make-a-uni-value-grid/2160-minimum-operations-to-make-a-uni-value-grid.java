import java.util.*;
class Solution {
    public int minOperations(int[][] grid, int x) {
        int result=0;
      
         ArrayList<Integer>li=new ArrayList<>();
        for(int row=0;row<grid.length;row++){
           for(int col=0;col<grid[0].length;col++){
                   li.add(grid[row][col]);
           }
        }
        Collections.sort(li);
       int median=(li.get(li.size()/2));
       System.out.print(median);
        for(int num:li){
            if(num%x!=median%x){
                return -1;
            }
            result+=Math.abs(median-num)/x;
        }

        return result;
    }
}