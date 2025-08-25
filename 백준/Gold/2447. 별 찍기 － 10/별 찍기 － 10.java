import java.io.*;

public class Main {
    static boolean isBlank(int i, int j) {
        while (i > 0 || j > 0) {
            if (i % 3 == 1 && j % 3 == 1) return true; // 가운데 블록
            i /= 3; j /= 3; // 상위 블록으로 이동
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(N * (N + 1));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(isBlank(i, j) ? ' ' : '*');
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}