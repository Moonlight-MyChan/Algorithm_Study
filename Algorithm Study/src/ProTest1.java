import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;

public class ProTest1 {

	static int num;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String arr[] = word.split("");
		
		String output[] = new String [arr.length];
		boolean visited[] = new boolean [arr.length];
		int n = word.length();
		num =0;
		perm(arr, output, visited, 1, n, 3, 0);
	}

	static void perm(String[] arr, String[] output, boolean[] visited, int start, int n, int r,int cnt) {
	    if (cnt == r) {
	    	for(int i =0 ; i < cnt; i++) {
	    		//if(visited[i]) {
	    			System.out.print(output[i]+"");
	    	//	}
	    	}
	    	num++;
	    	System.out.println("");
	        return;
	    }
	    for (int i=start-1; i<n; i++) {
	     //   if (visited[i] != true) {
	            visited[i] = true;
	            output[cnt] = arr[i];
	            perm(arr, output, visited, i + 1, n, r,cnt+1);       
	            visited[i] = false;;
	      //  }
	    }
	}
}
