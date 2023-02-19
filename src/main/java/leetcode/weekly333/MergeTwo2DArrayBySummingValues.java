package leetcode.weekly333;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/contest/weekly-contest-333/problems/merge-two-2d-arrays-by-summing-values/
public class MergeTwo2DArrayBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0, r = 0, n1 = nums1.length, n2 = nums2.length;
        List<int[]> list = new ArrayList();
        while(i < n1 || j < n2){
            int[] curr1 = new int[2];
            int[] curr2 = new int[2];
            if(i >= n1){
                curr2 = nums2[j];
                curr1 = new int[]{curr2[0], 0};
            }else if(j >= n2){
                curr1 = nums1[i];
                curr2 = new int[]{curr1[0], 0};
            }else{
                curr1 = nums1[i];
                curr2 = nums2[j];
            }
            if(curr1[0] == curr2[0]){
                list.add(new int[]{curr1[0], curr1[1] + curr2[1]});
                i++;
                j++;
            }else if(curr1[0] > curr2[0]){
                list.add(new int[]{curr2[0], curr2[1]});
                j++;
            }else{
                list.add(new int[]{curr1[0], curr1[1]});
                i++;
            }
            r++;
        }
        int[][] res = new int[list.size()][2];
        for(int x = 0; x < list.size(); x++){
            res[x] = list.get(x);
        }
        return res;

    }
}
