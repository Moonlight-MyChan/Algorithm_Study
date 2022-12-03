import java.util.Scanner;

public class ProTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		char c = sc.next().charAt(0);
		
		char arr[] = new char [3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		char output[] = new char [arr.length];
		boolean visited[] = new boolean [arr.length];
		int n = arr.length;
		
		perm(arr, output, visited, 0, n, 3);
	
	}
	
	static void perm(char [] arr, char[] output, boolean[] visited, int depth, int n, int r) {
	    if (depth == r) {
	    	for(int i =0 ; i < r; i++) {
	    		System.out.print(output[i]+"");
	    	}
	    	System.out.println();
	        return;
	    }
	    for (int i=0; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, depth + 1, n, r);       
	            visited[i] = false;;
	        }
	    }
	}
}
