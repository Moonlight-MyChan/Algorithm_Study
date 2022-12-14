package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_2 {

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

        int answer =  Solution(arr);
        System.out.println(answer);

	}

	public static int Solution (int [] arr)
	{
        int maxVal = arr[0];
        int answer = 1;

        for (int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > maxVal)
            {
                answer++;
                maxVal = arr[i];
            }
        }

        return answer;
    }
}
