import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		br.close();
		
		int length = input.length();
		Integer[] arr = new Integer[length];
		
		int n = Integer.parseInt(input);
		int cnt = 0;
		
		while (n > 0) {
			arr[cnt] = n % 10;
			n /= 10;
			cnt++;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int a : arr) {
			bw.write(a + "");
		}
		
		bw.flush();
		bw.close();
	}
}