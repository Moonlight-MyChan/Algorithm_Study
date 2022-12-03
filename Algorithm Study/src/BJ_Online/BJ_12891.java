package BJ_Online;

import java.util.*;
import java.io.*;

public class BJ_12891 {
	
	// �ּ� �Ѿ�� �� Count
	static int minA; 
	static int minC;
	static int minG;
	static int minT;
	
	// �־��� �������� �� ������ Count
	static int cntA; 
	static int cntC ;
	static int cntG;
	static int cntT;
	
	static int result; //��� ���

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // �� ���ڿ� ����
		int M = Integer.parseInt(st.nextToken()); // DNA ���ڿ� ����
		
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
		
		// �ʱ� �迭 �¾�
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
