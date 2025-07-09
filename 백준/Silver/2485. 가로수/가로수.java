import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] diff = new int[n-1];
		
		for (int i=0; i<n-1; i++) {
			diff[i] = arr[i+1] - arr[i];
		}
		
		int gcd = diff[0];
		
		for (int i=1; i<diff.length; i++) {
			gcd = gcd(gcd, diff[i]);
		}
		
		System.out.println((arr[n-1] - arr[0])/gcd - n + 1);
		
		br.close();
	}

	private static int gcd(int a, int b) {
		while (a != 0) {
			int temp = b % a;
			b = a;
			a = temp;
		}
		return b;
	}

}