package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 입력 배열의 크기

		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> 
			{
				int first_abs = Math.abs(o1);
				int second_abs = Math.abs(o2);
				
				if(first_abs == second_abs)
					return o1 > o2 ? 1 : -1;
				else
					return first_abs - second_abs; 
			}	
		);
		
		for(int i = 0 ; i < N ; i++)
		{
			int request = Integer.parseInt(br.readLine());
			if(request == 0)
			{
				if(pq.isEmpty())
				{
					bw.write("0\n");
					bw.flush();
				}
				else
				{
					bw.write(Integer.toString(pq.poll())+"\n");
					bw.flush();	
				}
			}
			else
			{
				pq.add(request);
			}
		}
		bw.close();
	}

}
