package leetcode.weekly328;

// https://leetcode.com/problems/increment-submatrices-by-one/
public class IncrementSubmatricesByOne {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];
        for(int[] query: queries){
            int toprow = query[0];
            int leftcol = query[1];
            int bottomrow = query[2];
            int rightcol = query[3];

            // prefix sum concept
            // basically , for every row toprow -> bottomrow, ist column of each row ( temp[j][leftcol]) will be done += (+1)
            // and the next column of the last column(except the last column, which we can ignore) of each row (i.e, temp[j][rightcol+1]) will be done += (-1)
            // so that when we get our desired sums while doing cumulative sum at last...
            for(int i = toprow; i <= bottomrow; i++){
                matrix[i][leftcol]++;

                if(rightcol < n-1){
                    matrix[i][rightcol+1] += -1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        return matrix;
    }
}
