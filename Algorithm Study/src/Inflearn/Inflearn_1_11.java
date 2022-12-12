package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_11 {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());// 배열 입력 개수
        String inputStr = br.readLine();

        bw.write(Solution(inputStr));
        bw.flush();
        bw.close();
        br.close();
	}

	public static String Solution (String inputStr)
	{
        StringBuilder sb = new StringBuilder();
        inputStr = inputStr + " ";
        int count = 1;

        for (int i = 0; i < inputStr.length() - 1 ; i ++)
        {
            if(inputStr.charAt(i) == inputStr.charAt(i + 1))
            {
                count++;
            }
            else
            {
                sb.append(inputStr.charAt(i));
                if(count > 1)
                {
                    sb.append(count);
                }
                count = 1;
            }
        }

        return sb.toString();
    }
}
