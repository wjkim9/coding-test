import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        int[] B = A.clone();
        Arrays.sort(B);

        // 중복 제거하며 값 -> 순위
        HashMap<Integer, Integer> rank = new HashMap<>( (int)(N / 0.75f) + 1 );
        int idx = 0;
        int last = Integer.MIN_VALUE;
        boolean first = true;
        for (int v : B) {
            if (first || v != last) {
                rank.put(v, idx++);
                last = v;
                first = false;
            }
        }

        StringBuilder sb = new StringBuilder(N * 3);
        for (int i = 0; i < N; i++) {
            sb.append(rank.get(A[i]));
            if (i + 1 < N) sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
