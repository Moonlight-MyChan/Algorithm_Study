package BJ_Online;

import java.util.*;
import java.io.*;

public class BJ_12891 {
	
	// 최소 넘어야 할 Count
	static int minA; 
	static int minC;
	static int minG;
	static int minT;
	
	// 주어진 값에서의 각 문자의 Count
	static int cntA; 
	static int cntC ;
	static int cntG;
	static int cntT;
	
	static int result; //출력 결과

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 총 문자열 길이
		int M = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
		
		char[] charArr = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		
		minA = Integer.parseInt(st.nextToken());
		minC = Integer.parseInt(st.nextToken());
		minG = Integer.parseInt(st.nextToken());
		minT = Integer.parseInt(st.nextToken());
		
		result = 0;
		cntA = 0; 
		cntC = 0;
		cntG = 0;
		cntT = 0;
		
		// 초기 배열 셋업
		for (int i = 0; i < M; i ++)
		{
			Add(charArr[i]);
		}
		checkSum();
		
		for (int i = M ; i < N ; i++)
		{
			int j = i - M;
			Add(charArr[i]);
			Remove(charArr[j]);
			checkSum();
		}
		
		System.out.println(result);
		br.close();
	}
	
	private static void checkSum()
	{
		if(cntA >= minA && cntC >= minC && cntG >= minG && cntT >= minT)
		{
			result++;
		}
	}
	
	private static void Add(char c)
	{
		switch(c)
		{
			case 'A' : 
				cntA++;
				break;
			case 'C' : 
				cntC++;
				break;
			case 'G' : 
				cntG++;
				break;
			case 'T' : 
				cntT++;
				break;
		}
	}
	
	private static void Remove(char c)
	{
		switch(c)
		{
			case 'A' : 
				cntA--;
				break;
			case 'C' : 
				cntC--;
				break;
			case 'G' : 
				cntG--;
				break;
			case 'T' : 
				cntT--;				
				break;
		}
	}
	
}
