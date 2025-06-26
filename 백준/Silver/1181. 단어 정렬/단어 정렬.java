import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<String>();
		
		for (int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		br.close();
		
		String[] arr = set.stream().sorted((s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			
			return s1.length() - s2.length();
		}).toArray(String[]::new);
		
		for (String s : arr) {
			bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}