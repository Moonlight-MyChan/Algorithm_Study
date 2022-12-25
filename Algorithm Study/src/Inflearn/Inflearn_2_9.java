package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_9 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][] arr = new int[N+1][N+1];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = Solution(arr);

        System.out.println(answer);

	}

	public static int Solution (int [][] arr)
	{
        int max = 0;
        int sumi, sumj = 0;

        for (int i = 0; i < arr.length; i++)
        {
             sumi = sumj = 0;
            for (int j = 0; j < arr.length; j++)
            {
                sumi += arr[i][j];
                sumj += arr[j][i];
            }
            max = Math.max(sumi, max);
            max = Math.max(sumj, max);
        }

        int sumRB = 0; // 오른쪽 하단 방향의 대각선
        int sumLB = 0; // 왼쪽 하단 방향의 대각선

        for (int i = 0; i < arr.length; i++)
        {
            sumRB += arr[i][i];
            sumLB += arr[i][arr.length - i - 1];
            
            max = Math.max(arr[i][i], max);
        }
        max = Math.max(sumRB, max);
        max = Math.max(sumLB, max);

        return max;
    }


}
