package DataStructures;
import java.util.*;
public class Node 
{
	public int index; //index of node
	public LinkedList<Edge> e; //list of edges
	Node(int i)
	{
		index=i;
		e=new LinkedList();
	}
}
