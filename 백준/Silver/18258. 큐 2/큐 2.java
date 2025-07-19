import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> queue = new ArrayList<>();
        int index = 0;
        
        for (int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String command = st.nextToken();
        	
        	switch(command) {
	        	case "push":
	        		queue.add(Integer.parseInt(st.nextToken()));
	        		break;
	        	case "pop":
	        		if (index < queue.size()) {
	        			bw.write(queue.get(index) + "\n");
	        			index++;
	        		} else {
	        			bw.write("-1\n");
	        		}
	        		
	        		break;
	        	case "size":
	        		bw.write(queue.size() - index + "\n");
	        		break;
	        	case "empty":
	        		if (index == queue.size()) {
		        	    bw.write("1\n");
		        	} else {
		        	    bw.write("0\n");
		        	}

	        		break;
	        	case "front":
	        		if (index < queue.size()) {
	        			bw.write(queue.get(index) + "\n");
	        		} else {
	        			bw.write("-1\n");
	        		}
	        		
	        		break;
	        	case "back":
	        		if (index < queue.size()) {
	        			bw.write(queue.get(queue.size()-1) + "\n");
	        		} else {
	        			bw.write("-1\n");
	        		}
	        		
	        		break;
        	}
        	
        }

        br.close();
        bw.flush();
        bw.close();
    }
}