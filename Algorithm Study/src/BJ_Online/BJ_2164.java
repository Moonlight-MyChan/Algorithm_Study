package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 입력 배열의 크기

		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1 ; i <= N ; i++)
		{
			queue.offer(i);
		}

		while(queue.size() > 1)
		{
			queue.poll();
			queue.offer(queue.poll());
		}
		
		bw.write(Integer.toString(queue.poll()));
		bw.flush();
		br.close();
		bw.close();

	}

}
