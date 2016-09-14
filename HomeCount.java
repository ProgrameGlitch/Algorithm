public class HomeCount {

	public static void main(String[] args) {
		int[][] grid = {{0,0,0,0,0},{0,1,1,0,1},{0,0,0,1,0},{0,1,0,0,1},{0,0,1,1,0}};
        int ans = 0;  
        for( int i = 0; i < grid.length; i ++ ) { 
            for( int j = 0; j < grid[0].length; j ++ )  
            {  
                if( grid[i][j] == 1 )  
                {  
                	homeCountDFS(grid,i,j,grid.length,grid[0].length);
                	ans++;  
                }  
            }  
        }
       System.out.println(ans);
    } 
	public static void homeCountDFS(int[][] vis,int x,int y,int n,int m){
		if(x < 0 || y < 0 || x >= n || y >= m ||vis[x][y] == 0 ){
			return;
		}
		vis[x][y] = 0;
		homeCountDFS(vis,x - 1,y,n,m);
		homeCountDFS(vis,x,y - 1,n,m);
		homeCountDFS(vis,x,y + 1,n,m);
		homeCountDFS(vis,x + 1,y,n,m);
	}
}
