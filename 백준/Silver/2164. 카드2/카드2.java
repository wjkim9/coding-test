import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
        
        Deque<Integer> queue = new ArrayDeque<>();
        
        for (int i=1; i<=n; i++) {
        	queue.add(i);
        }
        
        for (int i=0; i<n-1; i++) {
        	queue.poll();
        	queue.add(queue.poll());
        }
        
        System.out.println(queue.poll());
    }
}