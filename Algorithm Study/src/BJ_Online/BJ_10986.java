package BJ_Online;

import java.io.*;
import java.util.*;


public class BJ_10986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String [] inputDataS = br.readLine().split(" ");
		int [] inputDataI = Arrays.stream(inputDataS).mapToInt(Integer::parseInt).toArray();
		
		int [] sumArray = new int [N];
		sumArray[0] = inputDataI[0];
		
		long [] namuji =  new long [M];
		long answer = 0;

		for (int i = 1 ; i < N ; i++)
		{
			sumArray[i] += sumArray[i -1]  + inputDataI[i];
		}
		
		for (int i = 0 ; i < N ; i++)
		{
			int temp =  sumArray[i] % M;
			if(temp== 0) 
				{
					answer ++;
				}
			namuji[temp]++;
		}
		
		for(int i = 0 ; i < M; i++) 
		{
			if(namuji[i] > 1)
			{
				answer = answer + (namuji[i] * (namuji[i] - 1) / 2);
			}
		}
		
		bw.write(Long.toString(answer));
		bw.flush();
		bw.close();
	}

}
