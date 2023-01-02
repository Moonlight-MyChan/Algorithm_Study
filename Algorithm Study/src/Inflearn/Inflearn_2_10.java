package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_10 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][] arr = new int[N+2][N+2];

        for (int i = 1; i <= N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Solution(arr, N));

	}

	public static int Solution (int [][] arr, int N)
	{
        int [] dx = new int [] {0, 0, 1, -1};
        int [] dy = new int [] {1, -1, 0, 0};
        int count = 0;

        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N; j++)
            {
                boolean flag = true;
                for(int k = 0; k < 4; k++)
                {
                    if (arr[i][j] <= arr[i + dx[k]][j + dy[k]])
                    {
                        flag = false;
                    }
                }
                if(flag)
                {
                    count++;
                }
            }
        }
        return count;

    }
}
