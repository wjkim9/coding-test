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

		String input = br.readLine();
		int length = input.length();
		
		Set<String> set = new HashSet<>();
		int wide = 1;
		
		while (wide <= length) {
			for (int i=0; i+wide<=length; i++) {
				set.add(input.substring(i, i+wide));
			}
			wide++;
		}
		
		bw.write(set.size() + "");
		br.close();
		bw.flush();
		bw.close();
	}
}