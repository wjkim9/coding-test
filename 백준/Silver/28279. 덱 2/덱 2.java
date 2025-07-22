import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deck = new ArrayDeque<>();
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			
			switch (a) {
				case 1:
					deck.push(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					deck.add(Integer.parseInt(st.nextToken()));
					break;
				case 3:
					bw.write((deck.isEmpty() ? -1 : deck.pollFirst()) + "\n");
					break;
				case 4:
					bw.write((deck.isEmpty() ? -1 : deck.pollLast()) + "\n");
					break;
				case 5:
					bw.write(deck.size() + "\n");
					break;
				case 6:
					bw.write((deck.isEmpty() ? 1 : 0) + "\n");
					break;
				case 7:
					bw.write((deck.isEmpty() ? -1 : deck.peekFirst()) + "\n");
					break;
				case 8:
					bw.write((deck.isEmpty() ? -1 : deck.peekLast()) + "\n");
					break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}