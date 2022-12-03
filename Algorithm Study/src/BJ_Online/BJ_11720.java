package BJ_Online;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_11720 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); // °³¼ö
		String snumber [];
		int number [];
		String s = br.readLine();
		snumber = s.split("");
		
		int sum = 0;
		
		for(int i = 0; i < N ; i++)
		{
			sum += Integer.parseInt(snumber[i]); 
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
