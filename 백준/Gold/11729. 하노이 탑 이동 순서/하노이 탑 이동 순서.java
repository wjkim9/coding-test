import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
    static StringBuilder sb = new StringBuilder(1 << 22); // 대략 수 MB 버퍼
    static void hanoi(int n, int from, int to, int aux) {
        if (n == 0) return;
        hanoi(n - 1, from, aux, to);
        sb.append(from).append(' ').append(to).append('\n');
        hanoi(n - 1, aux, to, from);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long moves = (1L << n) - 1;        // 2^n - 1
        hanoi(n, 1, 3, 2);
        StringBuilder out = new StringBuilder(sb.length() + 24);
        out.append(moves).append('\n').append(sb);
        System.out.print(out.toString());
    }
}