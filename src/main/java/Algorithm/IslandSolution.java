package Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Get the number of islands from a 2D array
 */

public class IslandSolution {

    static List getNumOfIslands(char[][] area){
        int m = area.length;
        int n = area[0].length;
        int count = 0;
        List<Integer> ss = new ArrayList<Integer>();
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                if(area[i][j]=='1'){
                    DFS(area,i,j);
                    count++;
                }
            }
        }
        return ss;
    }

    static int getMaxAreaOfIsland(char[][] area){
        int m = area.length;
        int n = area[0].length;
//        List<Integer> ans = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++) {
                if (area[i][j]=='1'){
                    ans = Math.max(ans,DFS(area,i,j));
                }
            }
        }
        return ans;
    }

    static int DFS(char[][] area, int i, int j){
        if(i<0 || j<0 || i>=area.length || j>=area[0].length || area[i][j]!='1')
            return 0;
        area[i][j]='0';
        return (1 + DFS(area,i,j+1) + DFS(area,i,j-1) + DFS(area,i+1,j) + DFS(area,i-1,j));

    }

    public static void main(String[] args) {
        char[][] island = {
                {'1','1','1','1','0'},
                {'1','0','0','1','0'},
                {'1','1','1','0','0'},
                {'0','0','0','1','0'}
        };
        System.out.println(getMaxAreaOfIsland(island));
    }
}
