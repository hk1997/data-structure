package DataStructures;
import java.util.*;
public class Graph 
{
	List<Node> g;
	boolean state[];
	int _n; //no of vertices
	
	Graph(int v) //default ctor
	{
		//param @v= number of vertices in graph
		_n=v;
		g=new ArrayList<Node>(v);
		for(int i=0;i<v;i++)
			g.add(new Node(i));
		
		state=new boolean[v];
		
	}
	
	//function to add edge
	void addEdge(int v1,int v2) 
	{
		//param @v1=source vertex param@v2=destination vertex
		Node node=g.get(v1);
		node.e.add(new Edge(g.get(v2)));
	}
	
	void printGraph() //function to print adjacency list
	{
		Iterator<Node> node=g.iterator();
		while(node.hasNext())
		{
			Node n=node.next();
			System.out.println("Node"+n.index+"adjacency list is");
			Iterator<Edge> edge=n.e.iterator();
			while(edge.hasNext())
			{
				Edge e=edge.next();
				System.out.println(e.dest.index);
			}
		}
	}
	
	//getter functions
	Node getNode(int i)
	{
		if(i>=_n)
			return null;
		else
			return g.get(i);
	}
	
	//functions for traversals
	
	void BFS(int v)
	{
		for(int i=0;i<_n;i++)
			state[i]=false;
		
		Queue q=new Queue(100);
		q.queue(getNode(v));
		state[v]=true;
		while(!q.isEmpty())
		{
			Node n=Node.class.cast(q.dequeue());
			System.out.println(n.index);
			Iterator<Edge> i=n.e.iterator();
			while(i.hasNext())
			{
				Edge e=i.next();
				if(!state[e.dest.index])
				{
					q.queue(e.dest);
					state[e.dest.index]=true;
				}
			}
		}
	} //end of bfs
	
	//dfs traversal
	void DFS(int v)
	{
		//param @v=starting vertex for dfs
		for(int i=0;i<_n;i++)
			state[i]=false; //initially all vertices are unvisited
		
		DFSUtil(v);
	}
	
	void DFSUtil(int v)
	{
		state[v]=true;
		System.out.println(v);
		
		Node n=g.get(v);
		Iterator<Edge> i=n.e.iterator();
		while(i.hasNext())
		{
			int v0=i.next().dest.index;
			if(!state[v0]) //v0 is unvisited
				DFSUtil(v0);
		}
		
	}
	
	
	
	
}
