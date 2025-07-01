import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> map = new HashMap<>();
		Map<String, Integer> revMap = new HashMap<>();
		
		for (int i=1; i<=n; i++) {
			String input = br.readLine();
			map.put(i, input);
			revMap.put(input, i);
		}

		for (int i=0; i<m; i++) {
			String input = br.readLine();
			
			if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
				bw.write(map.get(Integer.parseInt(input)) + "\n");
			} else {
				bw.write(revMap.get(input) + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}