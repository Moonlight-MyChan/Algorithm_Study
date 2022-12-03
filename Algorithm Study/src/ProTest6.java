import java.util.*;
import java.io.*;

public class ProTest6 {

	public static int[] arr = new int[5];
	public static boolean[] visited = new boolean[5];
	public static int Max = 0;
	public static int Min = Integer.MAX_VALUE;
	public static int [] order = new int[5];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
        	arr[i]=sc.nextInt();
        }

        dfs(0, arr[0]);
        
        System.out.println(Max);
        System.out.println(Min);
        sc.close();
    }
    
    static void dfs(int depth, int val)
    {
    	if(depth > arr.length - 1)
    	{
    		int result = (order[0] * order[1]) - (order[2] * order[3]) + order[4];
    		
    		Max = Math.max(Max, result);
    		Min = Math.min(Min, result);
    		return;
    	}
    	
    	for (int i = 0; i < arr.length; i++)
    	{
    		if(!visited[i])
    		{
    			visited[i] = true;
    	    	order[depth] = arr[i];
    			dfs(depth + 1, arr[i]);
    			visited[i] = false;
    		}
    	}
    	
    }
    


}