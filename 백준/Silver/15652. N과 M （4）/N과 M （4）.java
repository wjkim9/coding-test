import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] pick;
    static StringBuilder sb = new StringBuilder(1 << 20); // ~1MB

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pick = new int[m];
        dfs(0, 1); // depth=0, 다음 수는 최소 1부터(비내림차순 시작점)

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    // 중복 허용 + 비내림차순: 다음 선택은 항상 'start' 이상에서 고르기
    static void dfs(int depth, int start) {
        if (depth == m) {
            for (int i = 0; i < m - 1; i++) sb.append(pick[i]).append(' ');
            sb.append(pick[m - 1]).append('\n');
            return;
        }
        for (int num = start; num <= n; num++) {
            pick[depth] = num;
            dfs(depth + 1, num); // 같은 수를 또 쓸 수 있게 'num'을 그대로 넘김
        }
    }
}