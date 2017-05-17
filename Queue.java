package DataStructures;
import java.util.*;
public class Queue 
{
	private	ArrayList q;
	
	
	Queue() //default ctor
	{
		q=new ArrayList();
	}
	
	Queue(int n) //parameterised ctor
	{
		q=new ArrayList(n);
	}
	
	void queue(Object o)
	{
		q.add(o);
	}
	
	Object dequeue()
	{
		if(q.size()==0)
			return null;
		else
		{
			 Object o=q.get(0);
			 q.remove(0);
			 return o;
		}
	}	
	
	boolean isEmpty()
	{
		if(q.size()==0)
			return true;
		else
			return false;
		
	}
	
	
	
}
