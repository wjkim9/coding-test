import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 0;
		
		while (cnt < n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);
	}
}