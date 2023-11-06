package leetcode.weekly370;

public class FindChampion1 {
    public int findChampion(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++){
            boolean champ = true;
            for(int j = 0; j < m; j++){
                if(i == j) continue;
                champ = champ && (grid[i][j] == 1);
            }
            if(champ) return i;
        }
        return -1;
    }
}
