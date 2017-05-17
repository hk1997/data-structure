package DataStructures;
import java.util.*;

public class MinHeap 
{
	int[] harr; //array to store elements of heap
	int capacity; //maximum capacity of array
	int heap_size; //number of elements currently in heap
	//constructor 
	public MinHeap(int cap) 
	{
		// TODO Auto-generated constructor stub
		this.capacity=cap;
		harr=new int[cap+1];
		heap_size=0;
	}
	
	 	int parent(int i) { return (i-1)/2; }
	 
	    // to get index of left child of node at index i
	    int left(int i) { return (2*i + 1); }
	 
	    // to get index of right child of node at index i
	    int right(int i) { return (2*i + 2); }
	    
	    //to extract minimum element,i.e, root from heap
	    int extractMin()
	    {
	    	if(heap_size<=0)
	    		return Integer.MAX_VALUE;
	    	else if(heap_size==1)
	    	{
	    		heap_size--;
	    		return harr[0];
	    	}
	    	else
	    	{
	    		int root=harr[0];
	    		harr[0]=harr[heap_size-1];
	    		heap_size--;
	    		MinHeapify(0);
	    		return root;
	    	}
	    }
	    // Decreases key value of key at index i to new_val
	    void decreaseKey(int i, int new_val)
	    {
	    	harr[i] = new_val;
	        while (i != 0 && harr[parent(i)] > harr[i])
	        {
	           swap(i, parent(i));
	           i = parent(i);
	        }

	    }
	    // Returns the minimum key (key at root) from min heap
	    int getMin() { return harr[0]; }
	 
	    // Deletes a key stored at index i
	    void deleteKey(int i)
	    {
	    	 decreaseKey(i, Integer.MIN_VALUE);
	    	    extractMin();
	    }
	    //to insert a new key
	    void insertKey(int k)
	    {
	        if (heap_size == capacity)
	        {
	            return;
	        }
	     
	        // First insert the new key at the end
	        heap_size++;
	        int i = heap_size - 1;
	        harr[i] = k;
	     
	        // Fix the min heap property if it is violated
	        while (i != 0 && harr[parent(i)] > harr[i])
	        {
	           swap(i, parent(i));
	           i = parent(i);
	        }
	    }
	    //to heapify a subtree with given root
	    void MinHeapify(int i)
	    {
	    	 int l = left(i);
	    	    int r = right(i);
	    	    int smallest = i;
	    	    if (l < heap_size && harr[l] < harr[i])
	    	        smallest = l;
	    	    if (r < heap_size && harr[r] < harr[smallest])
	    	        smallest = r;
	    	    if (smallest != i)
	    	    {
	    	        swap(i, smallest);
	    	        MinHeapify(smallest);
	    	    }
	    }
	    
	    //function to swap elements in array
	    void swap(int i,int j)
	    {
	    	int temp=harr[i];
	    	harr[i]=harr[j];
	    	harr[j]=temp;
	    }
	    
	  //get key
	    int  getKey(int element)
	    {
	    	int key=-1;
	    	for(int i=0;i<heap_size;i++)
	    	{
	    		if(harr[i]==element)
	    		{
	    			key=i;
	    			break;
	    		}
	    	}
	    	return key;
	    }
	    public static void main(String[] args) 
	    {
		// TODO Auto-generated method stub
	    	Scanner hk=new Scanner(System.in);
	    	int n=hk.nextInt();
	    	int k=hk.nextInt();
	    	MinHeap hp=new MinHeap(n);
	    	for(int i=0;i<n;i++)
	    		hp.insertKey(hk.nextInt());
	    	
	    	boolean ans=false;
	    	int count=0;
	    	while(hp.capacity>=0)
	    	{
	    		System.out.println(hp.getMin());
	    		if(hp.getMin()>k)
	    		{
	    			ans=true;
	    			break;
	    		}
	    		//if not then applying the formula
	    		count++;
	    		int el1=hp.extractMin();
	    		int el2=hp.extractMin();
	    		hp.insertKey(1*el1+2*el2);
	    	}
	    	if(ans)
	    		System.out.println(count);
	    	else
	    		System.out.println(-1);
	    }

}
