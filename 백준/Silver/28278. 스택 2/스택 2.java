import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		List<Integer> stack = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());

			switch (command) {
				case 1:
					int num = Integer.parseInt(st.nextToken());
					stack.add(num); // push
					break;

				case 2:
					if (stack.isEmpty()) {
						sb.append("-1\n");
					} else {
						sb.append(stack.remove(stack.size() - 1)).append("\n"); // pop
					}
					break;

				case 3:
					sb.append(stack.size()).append("\n"); // size
					break;

				case 4:
					sb.append(stack.isEmpty() ? 1 : 0).append("\n"); // empty
					break;

				case 5:
					if (stack.isEmpty()) {
						sb.append("-1\n");
					} else {
						sb.append(stack.get(stack.size() - 1)).append("\n"); // top
					}
					break;
			}
		}
		
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}
}
