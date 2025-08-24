import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] a = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) a[i][j] = s.charAt(j); // 'W' or 'B'
        }

        int best = 64; // 최대 8x8 전체 칠하기
        for (int i = 0; i + 7 < N; i++) {
            for (int j = 0; j + 7 < M; j++) {
                int diffW = 0, diffB = 0;
                for (int r = i; r < i + 8; r++) {
                    for (int c = j; c < j + 8; c++) {
                        boolean sameParity = ((r - i) + (c - j)) % 2 == 0;
                        char expectedW = sameParity ? 'W' : 'B';
                        char expectedB = sameParity ? 'B' : 'W';
                        if (a[r][c] != expectedW) diffW++;
                        if (a[r][c] != expectedB) diffB++;
                    }
                }
                int cur = Math.min(diffW, diffB);
                if (cur < best) best = cur;
                if (best == 0) { // 조기 종료(이미 완벽한 8x8 발견)
                    System.out.println(0);
                    return;
                }
            }
        }
        System.out.println(best);
    }
}