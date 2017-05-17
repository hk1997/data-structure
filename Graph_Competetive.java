package DataStructures;
import java.util.*;
 class Solution 
{
	private int V;   // No. of vertices
	 
    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    Solution(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
        adj[w].add(v);  // Add w to v's list.
        
    }
    
    public static void main(String[] args)
    {
    	Scanner hk=new Scanner(System.in);
    	int n=hk.nextInt();
    	Solution o=new Solution(n);
    	for(int i=0;i<n;i++)
    		hk.nextInt();
    	int q=hk.nextInt();
    	while(q--!=0)
    	{
    		int a=hk.nextInt();
    		int b=hk.nextInt();
    		o.addEdge(a, b);
    	
    	}
    	int max=0;
    	for(int i=0;i<n;i++)
    	{
    		int temp=o.adj[i].size();
    		if(temp>max)
    			max=temp;
    	}
    	System.out.println(max);
    	
    	
    }

}
