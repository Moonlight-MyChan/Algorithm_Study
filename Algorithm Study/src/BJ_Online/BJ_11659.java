package BJ_Online;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 개수 N
		int M = Integer.parseInt(st.nextToken()); // 구해야 하는 횟수 M
		int [] sumPart = new int[N + 1];
		sumPart[0] = 0;
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N ; i++)
		{
			sumPart[i] = Integer.parseInt(st2.nextToken()) + sumPart[i - 1] ;
		}
		
		for(int i = 1 ; i <= M ; i++)
		{
			StringTokenizer stTemp = new StringTokenizer(br.readLine());
			int i1 = Integer.parseInt(stTemp.nextToken()); //구간 시작
			int i2 = Integer.parseInt(stTemp.nextToken()); //구간 종료
			int result = sumPart[i2] - sumPart[i1 - 1]; 
			
			bw.write(Integer.toString(result));
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		bw.close();
		
	}

}
