package Inflearn;

import java.util.*;
import java.io.*;
import java.sql.SQLTimeoutException;

public class Inflearn_1_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 배열 입력 개수
		String [] inputArr = new String [N];
		ArrayList answerList = new ArrayList<String>();

		for(int i = 0 ; i < N ; i++)
		{
			st = new StringTokenizer(br.readLine());
			inputArr[i] = st.nextToken();
		}

		answerList = Solution(N, inputArr);

		for(int i = 0 ; i < N ; i++)
		{
			bw.write(answerList.get(i).toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static ArrayList<String> Solution (int N, String [] arr)
	{
		ArrayList returnList = new ArrayList<String>();

		for(int i = 0 ; i < N ; i++)
		{
			returnList.add(new StringBuilder(arr[i]).reverse().toString());
		}

		return returnList;
	}

}
