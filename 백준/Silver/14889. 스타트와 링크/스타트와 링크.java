import java.io.*;
import java.util.*;

public class Main {
    
	static int N;
    static int[][] S;          // 원본 시너지
    static boolean[] pick;     // true = A팀, false = B팀
    static int best = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        N = Integer.parseInt(br.readLine().trim());
        S = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) S[i][j] = Integer.parseInt(st.nextToken());
        }

        pick = new boolean[N];
        pick[0] = true;                 // 대칭 제거: 0번은 A팀 고정
        dfs(1, 1);                      // start=1, 현재 A팀 인원=1(0번 포함)
        System.out.println(best);
    }

    static void dfs(int start, int picked) {
        if (best == 0) return;          // 조기 종료
        if (picked == N / 2) {          // 리프: 점수 계산
            eval();
            return;
        }
        int need = N / 2 - picked;      // 앞으로 더 뽑아야 하는 인원
        for (int i = start; i <= N - need; i++) {
            pick[i] = true;
            dfs(i + 1, picked + 1);
            pick[i] = false;
        }
    }

    static void eval() {
        int a = 0, b = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int pair = S[i][j] + S[j][i];      // 필요할 때만 즉석 계산
                if (pick[i] && pick[j]) a += pair; // A팀 쌍만
                else if (!pick[i] && !pick[j]) b += pair; // B팀 쌍만
            }
        }
        int diff = Math.abs(a - b);
        if (diff < best) best = diff;
    }
}