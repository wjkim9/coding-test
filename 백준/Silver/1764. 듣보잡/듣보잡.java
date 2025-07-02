import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();
		
		for (int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		
		int cnt = 0;
		List<String> list = new ArrayList<>();
		
		for (int i=0; i<m; i++) {
			String input = br.readLine();
			
			if (set.contains(input)) {
				cnt++;
				list.add(input);
			}
		}
		br.close();
		bw.write(cnt + "\n");
		
		list.sort((a, b) -> {
			return a.compareTo(b);
		});
		
		for (int i=0; i<list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}