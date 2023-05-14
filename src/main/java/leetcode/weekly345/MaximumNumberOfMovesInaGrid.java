package leetcode.weekly345;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/contest/weekly-contest-345/problems/maximum-number-of-moves-in-a-grid/
public class MaximumNumberOfMovesInaGrid {
    public int maxMoves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Map<String, Integer> map = new HashMap();
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, dfs(grid, i, 0, map));
        }
        return max;

    }

    int dfs(int[][] grid, int i, int j, Map<String, Integer> map){
        if(j >= grid[0].length-1) return 0;

        String key = i + " " + j;
        if(map.containsKey(key)) return map.get(key);

        int curr = grid[i][j];

        int topR = (i > 0) ? grid[i-1][j+1] : 0;
        int right = grid[i][j+1];
        int botR = (i < grid.length-1) ? grid[i+1][j+1] : 0;

        int x = 0, y = 0, z = 0;
        if(topR > curr) x = dfs(grid, i-1, j+1, map) + 1;
        if(right > curr) y = dfs(grid, i, j+1, map) + 1;
        if(botR > curr) z = dfs(grid, i+1, j+1, map) + 1;

        int max = Math.max(x, Math.max(y, z));
        map.put(key, max);

        return max;
    }
}
