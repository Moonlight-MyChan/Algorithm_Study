import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ProTest2 {
	
	static int num;
	static int count;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int output[] = new int [arr.length];
		boolean visited[] = new boolean [arr.length];
		int n = arr.length;
		num =0;
		count = 0;
		perm(arr, output, visited, 0, n, r);
		System.out.println(count);
	}
	
	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
	    if (depth == r) 
	    {
	    	int sum =0;
	    	for(int i =0 ; i < r; i++) {
//	    		System.out.print(output[i]+" ");
	    		sum+=output[i];
	    	}
	    	if(sum ==7)
	    	{
//	    		System.out.print(" 7!!");
	    		count++;
	    	}
	    	
	    	num++;
//	    	System.out.println();
	        return;
	    }
	    for (int i=0; i<n; i++) {
	        //if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, depth + 1, n, r);       
	            visited[i] = false;;
	        //}
	    }
	}
}
