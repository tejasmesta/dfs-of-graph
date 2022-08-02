class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        boolean vis[] = new boolean[V+1];
        
        
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                dfs(i,vis,adj,ans);
            }
        }
        
        return ans; 
        
    }
    
    void dfs(int i, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans)
    {
        
        ans.add(i);
        
        vis[i] = true;
        
        for(Integer j:adj.get(i))
        {
            if(vis[j]==false)
            {
                dfs(j,vis,adj,ans);
            }
        }
        
    }
}
