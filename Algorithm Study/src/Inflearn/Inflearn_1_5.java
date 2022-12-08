package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_5 {

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
		char [] charArr = str.toCharArray();

		int lt = 0;
		int rt = charArr.length - 1;

		while(lt < rt)
		{
			if (!Character.isAlphabetic(charArr[lt]))
			{
				lt++;
			}
			else if (!Character.isAlphabetic(charArr[rt]))
			{
				rt--;
			}
			else
			{
				char temp;
				temp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt] = temp;

				lt++;
				rt--;
			}

		}


		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < charArr.length ; i++)
		{
			sb.append(charArr[i]);
		}

		return sb.toString();
	}

}
