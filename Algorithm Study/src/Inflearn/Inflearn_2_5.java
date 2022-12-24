package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_5{

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
		int arr [] = new int [N + 1];

		for (int i = 1 ; i <= N; i++)
		{
			arr[i] = 0;
		}

		System.out.println(Solution(N));

	}

	public static int Solution (int N)
	{
		int answer = 0;
		int arr [] = new int [N + 1];
		for(int i = 2 ; i <= N; i++)
		{
			if(arr[i] == 0)
			{
				answer++;
				for(int j = i ; j <= N; j += i)
				{
					arr[j] = 1;
				}
			}
		}

		return answer;
    }
}
