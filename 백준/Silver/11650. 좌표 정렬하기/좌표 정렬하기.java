import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		Point[]	arr = new Point[n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Point point = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			arr[i] = point;
		}
		br.close();
		
		Arrays.sort(arr, (p1, p2) -> {
			if (p1.x == p2.x) {
				return p1.y - p2.y;
			}
			return p1.x - p2.x;
		});

		for (Point p : arr) {
			bw.write(p.x + " " + p.y + "\n");
		}

		bw.flush();
		bw.close();
	}
}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}