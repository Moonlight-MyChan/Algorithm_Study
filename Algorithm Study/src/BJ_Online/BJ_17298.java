package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_17298 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 입력 배열의 크기
		int [] arr = new int [N]; // 수열 배열
		int [] answer = new int [N]; // 수열 배열
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		
		for(int i = 1; i < N; i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i])
			{
				answer[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty())
		{
			answer[stack.pop()] = -1;
		}
		
		for(int i = 0; i < N; i++)
		{
			bw.write(answer[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		br.close();
		bw.close();
	}

}
