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
        int [][] arr = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println("Test");

	}

	// public static int Solution (int [][] arr, int N)
	// {
        

    // }
}
