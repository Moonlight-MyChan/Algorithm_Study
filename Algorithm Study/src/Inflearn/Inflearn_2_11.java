package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_11 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][] arr = new int[N + 1][6];

        for (int i = 1; i <= N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Solution(arr, N));

	}

	public static int Solution (int [][] arr ,int N)
	{
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++)
        {
            int cnt = 0;
            for (int j = 1; j <= N; j++)
            {
                if(i==j) continue;
                for (int k = 1; k <= 5; k++)
                {
                    if(arr[i][k] == arr[j][k])
                    {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max)
            {
                max = cnt;  
                answer = i;
            }
        }

        return answer;
    }
}
