package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_3 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        int [] arrA = new int [N];
        int [] arrB = new int [N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++)
        {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++)
        {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Solution(arrA, arrB );

	}

	public static void Solution (int [] arrA, int [] arrB)
	{
        int N = arrA.length;

        for (int i = 0 ; i < N ; i++)
        {
            if(arrA[i] == arrB[i])
            {
                System.out.println("D");
            }
            else if(arrA[i] == 1 && arrB[i] == 3)
            {
                System.out.println("A");
            }
            else if(arrA[i] == 2 && arrB[i] == 1)
            {
                System.out.println("A");
            }
            else if(arrA[i] == 3 && arrB[i] == 2)
            {
                System.out.println("A");
            }
            else
            {
                System.out.println("B");
            }
        }

    }
}
