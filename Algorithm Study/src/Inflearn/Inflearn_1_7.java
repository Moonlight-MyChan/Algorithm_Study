package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String inputStr = st.nextToken(); // 배열 입력 개수

		bw.write(Solution(inputStr));
		bw.flush();
		bw.close();
		br.close();
	}

	public static String Solution (String str)
	{
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i ++)
        {
            if(str.indexOf(str.charAt(i)) == i)
            {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();
	}

}
