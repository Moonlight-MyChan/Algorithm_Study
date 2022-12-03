package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_1377 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		Data [] arr = new Data [N];

		for(int index = 0; index < N ; index++)
		{
			st = new StringTokenizer(br.readLine());
			arr[index] = new Data(Integer.parseInt(st.nextToken()), index);
		}

		Arrays.sort(arr, (Data d1, Data d2) -> d1.value - d2.value ); 
		
		int max = 0;
		for(int i =0 ; i < N ; i++)
		{
			max = Math.max(max, arr[i].index - i);
		}
		
		System.out.println(max + 1);
	}
}

class Data
{
	int value;
	int index;
	
	Data(int value, int index)
	{
		this.value = value;
		this.index = index;
	}
}