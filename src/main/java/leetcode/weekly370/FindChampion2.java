package leetcode.weekly370;

import java.util.HashSet;
import java.util.Set;

public class FindChampion2 {
    public int findChampion(int n, int[][] edges) {
        Set<Integer> nodes = new HashSet<>();
        UnionFind unionFind = new UnionFind(n);

        for(int[] edge: edges){
            nodes.add(edge[0]);
            nodes.add(edge[1]);
            unionFind.unify(edge[0], edge[1]);
        }

        int res = -1;
        for(int i = 0; i < unionFind.data.length; i++){
            if(i == unionFind.data[i] && res != -1) return -1;
            else if(i == unionFind.data[i]) res = i;
        }
        return res;
    }

    class UnionFind{
        public int data[];

        public UnionFind(int n){
            data = new int[n];
            for(int i = 0; i < n; i++) data[i] = i;
        }

        public void unify(int p, int q){
            int parentP = find(p);
            int parentQ = find(q);
            if(parentQ != q) return;
            data[parentQ] = parentP;
        }

        public int find(int p){
            int root = p;
            while(root != data[root]) root = data[root];
            return root;
        }
    }
}
