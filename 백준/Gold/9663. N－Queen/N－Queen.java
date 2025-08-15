import java.io.*;

public class Main {

    static int n;
    static long FULL; 
    static long ans = 0;

    static void dfs(long cols, long ld, long rd) {
        if (cols == FULL) { 
            ans++;
            return;
        }
        long avail = ~(cols | ld | rd) & FULL;
        while (avail != 0) {
            long bit = avail & -avail;
            avail -= bit;
            dfs(cols | bit, (ld | bit) << 1 & FULL, (rd | bit) >> 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine().trim());
        FULL = (1L << n) - 1;
        dfs(0L, 0L, 0L);
        System.out.println(ans);
    }
}
