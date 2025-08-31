import java.io.*;
import java.util.*;

public class Main {

	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        int N = Integer.parseInt(br.readLine().trim());
	        int[] type = new int[N];
	        int[] init = new int[N];

	        st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < N; i++) type[i] = Integer.parseInt(st.nextToken());

	        st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < N; i++) init[i] = Integer.parseInt(st.nextToken());

	        ArrayDeque<Integer> dq = new ArrayDeque<>();
	        for (int i = 0; i < N; i++) {
	            if (type[i] == 0) dq.addLast(init[i]); // 큐들만 유지 (왼→오 순서)
	        }

	        int M = Integer.parseInt(br.readLine().trim());
	        st = new StringTokenizer(br.readLine());
	        StringBuilder out = new StringBuilder(M * 3);

	        for (int i = 0; i < M; i++) {
	            int x = Integer.parseInt(st.nextToken());
	            if (dq.isEmpty()) {
	                out.append(x);
	            } else {
	                dq.addFirst(x);
	                out.append(dq.removeLast());
	            }
	            if (i + 1 < M) out.append(' ');
	        }
	        System.out.println(out);
	    }
}