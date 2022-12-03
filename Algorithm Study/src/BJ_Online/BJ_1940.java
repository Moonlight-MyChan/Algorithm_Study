package BJ_Online;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		int [] jaryo = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i ++)
		{
			jaryo[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(jaryo);
		
		int start_index = 0;
		int end_index = 1;
		int sum = 0;
		int count = 0;
		
		while(start_index !=  (N -1))
		{
			sum = jaryo[start_index] + jaryo[end_index] ;
			if(sum == M)
			{
				count++;
			}
			
			if(end_index == (N -1))
			{
				start_index++;
				end_index =  start_index + 1;
			}
			else
			{
				end_index++;
			}
			
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
