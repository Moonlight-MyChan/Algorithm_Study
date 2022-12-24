package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_6{

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
        
        for(int i = 0; i < N; i++)
        {
            Solution(arr[i]);
        }

	}

	public static void Solution (int N)
	{
        int reverseNum = 0;
        int temp = N;
        while(temp > 0)
        {
            int t = temp % 10;
            reverseNum = reverseNum * 10 + t;
            temp = temp / 10;
        }

        if(isPrime(reverseNum))
        {
            System.out.print(reverseNum + " ");
        }

    }

    public static boolean isPrime (int N)
    {
        if(N == 1)
        {
            return false;
        }
        else
        {
            for(int i = 2; i < N; i++)
            {
                if(N % i == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
