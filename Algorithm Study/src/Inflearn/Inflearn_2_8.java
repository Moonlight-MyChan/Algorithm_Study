package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_8{

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(arr);
	}

	public static void Solution (int [] arr)
	{
        int answer [] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++)
        // {
        //     answer[i] = 1;
        // }

        for (int i = 0; i < arr.length; i++)
        {
            answer[i] = 1;
            for(int j = 0 ; j < arr.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i] < arr[j])
                {
                    answer[i]++;
                }
            }

        }

        for (int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
    }


}
