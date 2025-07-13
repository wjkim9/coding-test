import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		final int MAX = 1000000;
		
		boolean[] isNotPrime = new boolean[MAX+1];
		
		for (int i=2; i*i<=MAX; i++) {
			if (!isNotPrime[i]) {
				for (int j=i*i; j<=MAX; j+=i) {
					isNotPrime[j] = true;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			int count = 0;
			
			for (int p = 2; p <= input / 2; p++) {
				if (!isNotPrime[p] && !isNotPrime[input - p]) {
					count++;
				}
			}
		bw.write(count + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}