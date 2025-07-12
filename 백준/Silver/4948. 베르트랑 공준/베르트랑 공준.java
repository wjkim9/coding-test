import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			int m = n * 2;

			if (n == 0) break;

			boolean[] isNotPrime = new boolean[m+1];
			int cnt = 0;

			for (int i=2; i*i<=m; i++) {
				if (!isNotPrime[i]) {
					for (int j=i*i; j<=m; j+=i) {
						isNotPrime[j] = true;
					}
				}
			}

			for (int i=n+1; i<=m; i++) {
				if (!isNotPrime[i]) cnt++;
			}

			bw.write(cnt + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}