package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_9 {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		String inputStr = br.readLine(); // 배열 입력 개수
        char [] charArr = inputStr.toCharArray();

        int answer = Integer.parseInt(Solution(charArr));

        bw.write(Integer.toString(answer));
        bw.flush();
        bw.close();
        br.close();
	}

	public static String Solution (char [] charArr)
	{
        StringBuilder sb = new StringBuilder();
        for (char ch : charArr)
        {
            if(Character.isDigit(ch))
            {
                sb.append(ch);
            }
        }
        return sb.toString();
	}

}
