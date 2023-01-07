package Inflearn;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;

public class Inflearn_3_2 {

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

        // Array Sort
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        Solution(arrN, arrM);

	}

	public static void Solution (int [] arrN, int [] arrM)
	{
       ArrayList <Integer> answerList = new ArrayList<>();
       int pointerN = 0;
       int pointerM = 0;
       
       while(pointerN < arrN.length && pointerM < arrM.length)
       {
           if(arrN[pointerN] < arrM[pointerM])
           {
               pointerN++;
           }
           else if(arrN[pointerN] > arrM[pointerM])
           {
               pointerM++;
           }
          else
          {
              answerList.add(arrN[pointerN]);
              pointerN++;
              pointerM++;
          }
       } 

       for (int answer : answerList)
       {
            System.out.print(answer + " ");
       }
    }
}
