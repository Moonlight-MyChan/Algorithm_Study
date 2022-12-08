package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		String inputStr = br.readLine(); // 배열 입력 개수

        if(Solution(inputStr))
        {
            bw.write("YES");
        }
        else
        {
            bw.write("NO");
        }

		bw.flush();
		bw.close();
		br.close();
	}

	public static boolean Solution (String str)
	{
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp))
        {
            return true;
        }
        else
        {
            return false;
        }
	}

}
