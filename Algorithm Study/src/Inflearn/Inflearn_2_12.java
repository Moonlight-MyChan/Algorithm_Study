package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_12 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());

        int [][] arr = new int[M + 1][N + 1];

        for (int i = 1; i <= M; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N ; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Solution(arr, N, M));

	}

	public static int Solution (int [][] arr, int N, int M )
	{
        int answer = 0;

        for (int k = 1; k <= N; k++)
        {
            for (int l = 1; l <= N; l++)
            {
                if(k == l)
                {
                    continue;
                }
                int count = 0;
                for(int i = 1; i <= M; i++)
                {
                    int mento = 0;
                    int menti = 0;
                    for(int j = 1; j <= N; j++)
                    {
                        if(arr[i][j] == k)
                        {
                            mento = j;
                        }
                        if(arr[i][j] == l)
                        {
                            menti = j;
                        }
                    }
                    if(mento < menti)
                    {
                        count++;
                    }
                }
                if(count == M)
                {
                    answer++;
                }
            }
        } 
        return answer;
    }
}
