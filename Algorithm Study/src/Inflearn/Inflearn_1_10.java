package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_1_10 {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()); // 배열 입력 개수
        String searchStr = st.nextToken();
        String targetS = st.nextToken();


        Solution(searchStr, targetS);
        // bw.write("Test");
        // bw.flush();
        // bw.close();
        // br.close();
	}

	public static void Solution (String searchStr, String targetS )
	{
        int distance = 1000; //1000으로 초기화
        int [] answer = new int [searchStr.length()];

        // Lefr에서 시작
        for(int i = 0; i < searchStr.length(); i ++)
        {
            if(searchStr.charAt(i) == targetS.toCharArray()[0])
            {
                distance = 0;
                answer[i] = distance;
            }
            else
            {
                distance++;
                answer[i] = distance;
            }
        }

        distance = 1000;

        for(int i = searchStr.length() - 1; i >= 0; i --)
        {
            if(searchStr.charAt(i) == targetS.toCharArray()[0])
            {
                distance = 0;
                answer[i] = Math.min(distance, answer[i]);
            }
            else
            {
                distance++;
                answer[i] = Math.min(distance, answer[i]);
            }
        }

        for(int i = 0; i < searchStr.length(); i ++)
        {
            System.out.print(answer[i] + " ");
        }
    }
}
