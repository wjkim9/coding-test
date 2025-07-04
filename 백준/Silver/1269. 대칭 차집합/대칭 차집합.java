import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());

		for (int i=0; i<m; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}

		Set<Integer> differenceSet = new HashSet<>();

		for (int a : setA) {
			if (!setB.contains(a)) {
				differenceSet.add(a);
			}
		}

		for (int a : setB) {
			if (!setA.contains(a)) {
				differenceSet.add(a);
			}
		}
		
		bw.write(differenceSet.size() + "");

		br.close();
		bw.flush();
		bw.close();
	}
}