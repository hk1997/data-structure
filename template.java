import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class template 
{
	static void Solution()
	{
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FastReader hk=new FastReader();
	}

	public static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;
		 
		public FastReader()
		{
		    br = new BufferedReader(new
		             InputStreamReader(System.in));
		}
		 
		String next()
		{
		    while (st == null || !st.hasMoreElements())
		    {
		        try
		        {
		            st = new StringTokenizer(br.readLine());
		        }
		        catch (IOException  e)
		        {
		            e.printStackTrace();
		        }
		    }
		    return st.nextToken();
		}
		 
		int nextInt()
		{
		    return Integer.parseInt(next());
		}
		 
		long nextLong()
		{
		    return Long.parseLong(next());
		}
		 
		double nextDouble()
		{
		    return Double.parseDouble(next());
		}
		 
		String nextLine()
		{
		    String str = "";
		    try
		    {
		        str = br.readLine();
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		    return str;
		}
		}

}
