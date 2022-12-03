package BJ_Online;

import java.io.*;
import java.util.*;


public class BJ_11399 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int arr [] = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i ++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 간단하게 아래 방법으로도 정렬 가능
//		Arrays.sort(arr);

		// 삽입 정렬
		for(int i = 1 ; i < N ; i ++)
		{
			int insert_index = i;
			int insert_value = arr[i];
			for(int j = i ; j > 0 ; j--)
			{
				if(arr[j - 1] > insert_value)
				{
					insert_index = j - 1;
				}
				else
				{
					break;
				}
			}
			
			for(int j = i; j > insert_index ; j--)
			{
				arr[j] = arr[j - 1];
			}
			arr[insert_index] = insert_value;
			
		}

		int sum [] = new int [N];
		sum[0] = arr[0];
		int answer = arr[0];
		for(int i = 1 ; i < N ; i ++)
		{
			sum[i] = sum[i -1] + arr[i];
			answer += sum[i];
		}
		System.out.println(answer);
	}

}
