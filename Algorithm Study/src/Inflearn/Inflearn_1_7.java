package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		String inputStr = st.nextToken(); // 배열 입력 개수

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

        int len = str.length();
        str = str.toUpperCase();
        
        for(int i = 0; i < len/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(len - 1 -i))
            {
                return false;
            }
        }

        return true;
	}

}
