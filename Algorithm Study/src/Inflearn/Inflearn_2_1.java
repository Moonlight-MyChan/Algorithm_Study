package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_1 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [N];

        for (int i = 0 ; i < N ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Solution(arr);

	}

	public static void Solution (int [] arr)
	{
        System.out.print(arr[0] + " ");

        for (int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > arr[i - 1])
            {
                System.out.print(arr[i] + " ");
            }
        }


    }
}
