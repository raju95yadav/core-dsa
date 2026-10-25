class Solution {
    int n,m;
    boolean dfs(int[][] grid,int i,int j){
        if(i>=n  || i<0 || j >=m || j<0){
            return false;
        }
        if(grid[i][j] == 1) return true;
        grid[i][j] = 1;
        boolean left_closed = dfs(grid, i , j-1);
        boolean right_closed = dfs(grid, i , j+1);
        boolean up_closed = dfs(grid, i-1 , j);
        boolean down_closed = dfs(grid, i+1 , j);
        return left_closed && right_closed && up_closed  && down_closed;
    }
    public int closedIsland(int[][] grid) {
        n =grid.length;
        m = grid[0].length;
       int count =0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0){
                if(dfs(grid,i,j)==true){
                    count ++;
                }
            }
        }
       }  
       return count;
    }
}