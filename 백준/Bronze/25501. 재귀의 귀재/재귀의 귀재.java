import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	private static int cnt = 0;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i=0; i<n; i++) {
        	String input = br.readLine();
        	
        	bw.write(isPalindrome(input) + " " + cnt + "\n");
        	cnt = 0;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

    private static int recursion(String input, int l, int r){
    	cnt += 1;
        if(l >= r) return 1;
        else if(input.charAt(l) != input.charAt(r)) return 0;
        else return recursion(input, l+1, r-1);
    }
    
    private static int isPalindrome(String input){
        return recursion(input, 0, input.length()-1);
    }
}