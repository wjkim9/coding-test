import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long n = Long.parseLong(br.readLine());
        
        bw.write(factorial(n) + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }

	private static long factorial(long n) {
		if (n == 0 || n == 1) return 1;
		
		return n * factorial(n-1);
	}
}