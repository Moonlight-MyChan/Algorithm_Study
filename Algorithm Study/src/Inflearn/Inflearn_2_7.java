package Inflearn;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.io.*;

public class Inflearn_2_7{

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
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                count++;
                sum += count;
            }
            else
            {
                count = 0;
            }
        }
        System.out.println(sum);
    }


}
