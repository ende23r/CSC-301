package unionfind;

public class WeightedQuickUnionUFPathCompressed {
    private int[] parent;
    private int[] size;
    
    public int find(int p) {
        //validate(p);
        if(p != parent[p]) {
            parent[p] = find(parent[p]);
        }
        return parent[p];
    }
}
