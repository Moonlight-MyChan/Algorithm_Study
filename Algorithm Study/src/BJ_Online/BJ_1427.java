package BJ_Online;

import java.io.*;
import java.util.*;

public class BJ_1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
        String[] strings = inputStr.split("");
        int[] arr = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray(); // 자바 String 배열을 Interger 배열로 변환
		int N = arr.length;
        
        for (int i = 0 ; i < N ; i++ )
        {
        	int max = i;

        	for(int j = i +1 ; j < N ; j++ )
        	{
        		if(arr[j] > arr[max])
        		{
        			max = j;
        		}
        	}
        	
        	if(arr[i] < arr[max])
        	{
        		int temp = arr[i];
        		arr[i] = arr[max];
        		arr[max] = temp;
        	}
        }
        
        for (int i = 0 ; i < N ; i++ )
        {
        	System.out.print(arr[i]);
        }
		
	}

}
