import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            int length = (int) Math.pow(3, n);
            char[] arr = new char[length];
            
            for (int i = 0; i < length; i++) arr[i] = '-';
            
            cantor(arr, 0, length);
            
            bw.write(new String(arr)+"\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    private static void cantor(char[] arr, int start, int length) {
        if (length == 1) return;

        int third = length / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        cantor(arr, start, third);
        cantor(arr, start + 2 * third, third);
    }

}
