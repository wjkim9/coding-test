import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[] isNotPrime = new boolean[m+1];
		
		for(int i=2; i*i<=m; i++) {
			if (!isNotPrime[i]) {
				for (int j=i*i; j<=m; j+=i) {
					isNotPrime[j] = true;
				}
			}
		}
		
		for (int i = n; i <= m; i++) {
		    if (!isNotPrime[i] && i > 1) {
		        bw.write(i + "\n");
		    }
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}