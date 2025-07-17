import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            
            if (input.equals(".")) break;
            
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for (char c : input.toCharArray()) {
            	if (c == '(' || c == '[') {
                    stack.push(c);
                } else {
                	
                	if (c == ')') {
                		if (!stack.isEmpty()) {
                			char pop = stack.pop();
                			
                			if (pop == '(') {
                				continue;
                			} else {
                				isValid = false;
                				break;
                			}
                		} else {
                			isValid = false;
            				break;
                		}
                		
                	}
                	
                	if (c == ']') {
	            		if (!stack.isEmpty()) {
	            			char pop = stack.pop();
	            			
	            			if (pop == '[') {
	            				continue;
	            			} else {
	            				isValid = false;
	            				break;
	            			}
	            		} else {
                			isValid = false;
            				break;
                		}
                	}
                }
                
            }
            
            if (!stack.isEmpty()) isValid = false;

            bw.write(isValid ? "yes\n" : "no\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}