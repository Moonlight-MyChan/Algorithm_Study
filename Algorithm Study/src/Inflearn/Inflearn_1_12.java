package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_12 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine()); 
        int N  = Integer.parseInt(br.readLine());
        String inStr = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        System.out.println(Solution(N, inStr));

	}

	public static String Solution (int N, String inStr)
	{
		String answer = "";
        for (int i = 0 ; i < N ; i++)
        {
            String tmp = inStr.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            inStr = inStr.substring(7);

        }
        return answer;
    }
}
