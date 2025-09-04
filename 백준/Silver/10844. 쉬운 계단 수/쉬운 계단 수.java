import java.io.*;
import java.util.*;

public class Main {
	static final long MOD = 1_000_000_000L;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());

        long[] prev = new long[10];
        long[] cur  = new long[10];

        // base: 길이 1
        for (int d = 1; d <= 9; d++) prev[d] = 1;

        for (int len = 2; len <= N; len++) {
            cur[0] = prev[1] % MOD;
            cur[9] = prev[8] % MOD;
            for (int d = 1; d <= 8; d++) {
                cur[d] = (prev[d - 1] + prev[d + 1]) % MOD;
            }
            // swap & clear
            long[] tmp = prev; prev = cur; cur = tmp;
            Arrays.fill(cur, 0);
        }

        long ans = 0;
        for (int d = 0; d <= 9; d++) ans = (ans + prev[d]) % MOD;
        System.out.println(ans);
    }
}