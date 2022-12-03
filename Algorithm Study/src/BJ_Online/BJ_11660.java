package BJ_Online;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 개수 N
		int M = Integer.parseInt(st.nextToken()); // 구해야 하는 횟수 M
		
		int arrSum [][] = new int [N + 1] [N  + 1];
		
		for(int i = 1; i <= N ; i++)
		{
			StringTokenizer stArr = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N ; j++ )
			{
				int current = Integer.parseInt(stArr.nextToken());
				arrSum[i][j] = arrSum[i-1][j] + arrSum[i][j-1] - arrSum[i-1][j-1] + current;
			}
		}

		for(int i = 1; i <= M ; i++)
		{
			int sum = 0; // 최종 출력값
			
			StringTokenizer sAxis = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(sAxis.nextToken());
			int y1 = Integer.parseInt(sAxis.nextToken());
			int x2 = Integer.parseInt(sAxis.nextToken());
			int y2 = Integer.parseInt(sAxis.nextToken());
			
			sum = arrSum[x2][y2] - arrSum[x1 - 1][y2] - arrSum[x2][y1 - 1] +  arrSum[x1 - 1][y1 - 1]; 
			
			bw.write(Integer.toString(sum));
			bw.flush();
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}
