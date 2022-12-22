package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_2_4 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        
        Solution(N);

	}

	public static void Solution (int N)
	{
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        
        System.out.print(1 + " " + 1 + " ");

        for (int i = 2 ; i < N ; i++)
        {
            int num = list.get(i - 2)+ list.get(i - 1);
            System.out.print(num + " " );
            list.add(num);
        }

    }
}
