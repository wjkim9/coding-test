import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        int sum = 0;
        int max = -4001;
        int min = 4001;
        
        for (int i=0; i<n; i++) {
        	int input = Integer.parseInt(br.readLine());
        	arr[i] = input;
        	
        	sum += input;
        	
        	if (input > max) max = input;
        	if (input < min) min = input;
        	
        }
        
        Arrays.sort(arr);
        
        int[] positive = new int[4001];
        int[] negative = new int[4001];
        
        for (int i=0; i<n; i++) {
        	if (arr[i] > 0) {
        		positive[arr[i]] += 1;
        		
        		continue;
        	}
        	
        	if (arr[i] < 0) {
        		negative[arr[i] * -1] += 1;
        		
        		continue;
        	}
        	
        	if (arr[i] == 0) {
        		positive[0] += 1;
        		
        	}
        }
        
        int maxFrequency = 0;
        
        for (int a : positive) {
        	if (a > maxFrequency) maxFrequency = a;
        }
        
        for (int a : negative) {
        	if (a > maxFrequency) maxFrequency = a;
        }
        
        List<Integer> frequencies = new ArrayList<>();
        
        for (int i=0; i<positive.length; i++) {
        	if (positive[i] == maxFrequency) frequencies.add(i);
        }
        
        for (int i=0; i<negative.length; i++) {
        	if (negative[i] == maxFrequency) frequencies.add(i * -1);
        }
        
        Collections.sort(frequencies);
        
        int frequency = frequencies.size() > 1 ? frequencies.get(1) : frequencies.get(0);
        
        bw.write((int)Math.round((double)sum / n) + "\n"); //평균
        bw.write(arr[n/2] + "\n"); //중앙값
        bw.write(frequency + "\n"); //최빈값
        bw.write(max - min + "\n"); //범위
        
        bw.flush();
        br.close();
        bw.close();
    }
}