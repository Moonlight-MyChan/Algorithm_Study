package BJ_Online;

import java.io.*;
import java.util.*;;

public class BJ_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 배열의 크기(숫자 개수)
		int arrN [] = new int [N + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i ++)
		{
			st = new StringTokenizer(br.readLine());
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		
		int num = 1; //오름차순 수
		boolean result = true;
		
		for (int i = 1; i <= N; i ++)
		{
			if(arrN[i] >= num)
			{
				while(arrN[i] >= num)
				{
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else
			{
				int n = stack.pop();
				if(n  > arrN[i])
				{
					System.out.println("NO");
					result = false;
					break;
				}
				else
				{
					sb.append("-\n");
				}
				
			}
		}
		if(result) System.out.println(sb.toString());
	}

}
