package BJ_Online;
import java.util.*;
import java.io.*;


public class BJ_1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String arrS[] = br.readLine().split(" ");
		int arrInt [] = Arrays.stream(arrS).mapToInt(Integer::parseInt).toArray();
		Integer [] arrInteger = Arrays.stream(arrInt).boxed().toArray(Integer [] :: new);
		Arrays.sort(arrInteger, Collections.reverseOrder());
		int max = arrInteger[0];
		double sum = 0;
		
		br.close();
		
		for(int i =0 ; i <arrInteger.length ; i++)
		{
			sum += (double)arrInteger[i]/max*100;
		}
		
		bw.write(String.valueOf(sum/arrInteger.length));
		bw.flush();
		bw.close();
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int M = Integer.parseInt(st.nextToken());

	}

}
