import java.util.*;
import java.io.*;

public class Combination_Sample {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int k = sc.nextInt();

        int[] coin = new int[n];
		coin[0] = 10;
		coin[1] = 40;
		coin[2] = 60;

        int[] dp = new int[k + 1];
        Arrays.fill(dp, 100001);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        System.out.println(dp[k] == 100001 ? -1 : dp[k]);
        sc.close();
    }

}