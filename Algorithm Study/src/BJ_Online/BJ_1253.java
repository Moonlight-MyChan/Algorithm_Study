package BJ_Online;

import java.util.*;
import java.io.*;

public class BJ_1253 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] value = new int[N];
		for(int i = 0 ; i < N ; i++)
		{
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(value);

		int start_index;
		int end_index;
		int count = 0;
		
		for(int i = 0 ; i < N ; i++)
		{
			start_index = 0;
			end_index = N -1;
			int find = value[i];
		
			while(start_index < end_index)
			{
				int sum = value[start_index] + value[end_index];
				
				if(sum == find) // find는 현재 배열의 값
				{
					if(start_index != i && end_index != i)
					{
						count++;
						break;
					}
					else if(start_index == i)
					{
						start_index++;
					}
					else if(end_index == i)
					{
						end_index--;
					}
				}
				else if(find>sum)
				{
					start_index++;
				}
				else
				{
					end_index--;
				}
			}
		}
		
	
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		
		br.close();
	}

}
