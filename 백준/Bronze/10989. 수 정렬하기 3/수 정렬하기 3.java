import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		final int MAX = 10000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] count = new int[MAX+1];
		
		for (int i=0; i<n; i++) {
			int val = Integer.parseInt(br.readLine());
			count[val]++;
		}
		br.close();
		
		for (int i=0; i<=MAX; i++) {
			while (count[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}