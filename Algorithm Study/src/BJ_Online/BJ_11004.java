package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_11004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int arr [] = new int [N];
		
		int K = Integer.parseInt(st.nextToken()); // K ¹øÂ° ¼ö
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i ++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[K-1]);
	}

}
