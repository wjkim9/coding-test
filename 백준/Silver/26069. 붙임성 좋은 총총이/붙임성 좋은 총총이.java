import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String,Integer> map = new HashMap<>();
        map.put("ChongChong" , 1);
        
        for (int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String name1 = st.nextToken();
        	String name2 = st.nextToken();
        	
        	if (!map.containsKey(name1)) {
        		map.put(name1, 0);
        	}
        	
        	if (!map.containsKey(name2)) {
        		map.put(name2, 0);
        	}
        	
        	if (map.get(name1) == 1 || map.get(name2) == 1) {
        		map.put(name1, 1);
        		map.put(name2, 1);
        	}
        }
        
        int count = 0;
        for (int value : map.values()) {
            if (value == 1) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}