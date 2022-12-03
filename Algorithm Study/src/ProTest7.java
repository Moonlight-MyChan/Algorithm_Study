import java.util.*;
import java.io.*;

public class ProTest7 {

	static int totalCount = 0;
	static int oddCount = 0; // È¦¼ö
	static int evenCount = 0; //Â¦¼ö
	static boolean [] doubleCheck = new boolean [10000];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		String [] vals = val.split("");
		
		String output[] = new String [vals.length];
		boolean visited[] = new boolean [vals.length];
		
		perm(vals, output, visited, 0, vals.length, 4);
		System.out.println(totalCount + " " + evenCount + " " + oddCount);
//		System.out.println(totalCount);
//		System.out.println(evenCount);
//		System.out.println(oddCount);
	}
	
	static void perm(String[] arr, String[] output, boolean[] visited, int depth, int n, int r) {
	    if (depth == r) {
	    	String s = "";
	    	for(int i =0 ; i < r; i++) {
//	    		System.out.print(output[i]+" ");
	    		s = s + output[i];
	    	}
//    		doubleCheck[Integer.parseInt(s)] = true;
//    		count++;
    		if(!doubleCheck[Integer.parseInt(s)])
    		{
        		doubleCheck[Integer.parseInt(s)] = true;
        		totalCount++;
        		
        		if(Integer.parseInt(s) % 2 == 0)
        		{
        			evenCount++;
        		}
        		else
        		{
        			oddCount++;
        		}
    		}
	    	
//    		System.out.println(s);
//	    	System.out.println();
	        return;
	    }
	    for (int i=0; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, depth + 1, n, r);       
	            visited[i] = false;
	        }
	    }
	}
}