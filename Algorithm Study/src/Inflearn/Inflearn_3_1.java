package Inflearn;

import java.util.*;
import java.io.*;

public class Inflearn_3_1 {

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N  = Integer.parseInt(st.nextToken());
        int [] arrN = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
        {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M  = Integer.parseInt(st.nextToken());
        int [] arrM = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++)
        {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        Solution(arrN, arrM);
	}

	public static void Solution (int [] arrN, int [] arrM)
	{
        int pointerN = 0;
        int pointerM = 0;

        while(true)
        {
            if(pointerN == arrN.length && pointerM == arrM.length)
            {
                break;
            }

            if(pointerN == arrN.length)
            {
                System.out.print(arrM[pointerM] + " ");
                pointerM++;
                continue;
            }
            else if(pointerM == arrM.length)
            {
                System.out.print(arrN[pointerN] + " ");
                pointerN++;
                continue;
            }
            else
            {
                if(arrN[pointerN] < arrM[pointerM])
                {
                    System.out.print(arrN[pointerN] + " ");
                    pointerN++;
                }
                else
                {
                    System.out.print(arrM[pointerM] + " ");
                    pointerM++;
                }
            }

        }
       
    }
}
