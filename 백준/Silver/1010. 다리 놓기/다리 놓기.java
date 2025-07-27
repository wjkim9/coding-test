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

		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken());
			long m = Long.parseLong(st.nextToken());
			
			long result = combination(m, n);
			
			bw.write(result + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static long combination(long m, long n) {
	    if (n > m - n) n = m - n;
	    long result = 1;
	    for (int i = 1; i <= n; i++) {
	        result = result * (m - i + 1) / i;
	    }
	    return result;
	}

}