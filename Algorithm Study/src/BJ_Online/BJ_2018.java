package BJ_Online;

import java.util.*;
import java.io.*;


public class BJ_2018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int start_index = 1;
		int end_index = 1;
		int count = 1;
		int sum = 1;

		while(end_index != N)
		{
			if(sum == N)
			{
				count++;
				end_index++;
				sum = sum + end_index;
			}
			else if(sum > N)
			{
				sum = sum - start_index;
				start_index ++;
			}
			else //(sum < N)
			{
				end_index++;
				sum = sum + end_index;
			}
		}

		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}

}
