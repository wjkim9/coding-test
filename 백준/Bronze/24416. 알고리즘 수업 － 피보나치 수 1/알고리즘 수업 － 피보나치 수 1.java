import java.io.*;

public class Main {
	
	static int count = 0;
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        recurseFibo(n);
        sb.append(count + " ");
        
        count = 0;
        
        dynamicFibo(n);
        sb.append(count);
        
        System.out.println(sb.toString());
        br.close();
    }

    private static int recurseFibo(int n) {
        if (n == 1 || n == 2) {
            count++;
            return 1;
        }
        return recurseFibo(n - 1) + recurseFibo(n - 2);
    }
	
	private static int dynamicFibo(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i=2; i<n; i++) {
			count++;
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n-1];
	}
}