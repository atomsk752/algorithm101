package algorithm101.baekjoon04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Algorithm04_0222_9498 {
	
	public static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		st = new StringTokenizer(br.readLine());
		
		int score = Integer.parseInt(st.nextToken());
		
		if (score >= 90) {
			
			System.out.println("A");
			
		}else if(80 <=score && score < 90){
			
			System.out.println("B");
			
		}else if (70 <= score && score < 80) {
			
			System.out.println("C");
			
		}else if (60 <= score && score < 70) {
			
			System.out.println("D");
			
		}else{
			
			System.out.println("F");
			
		}
		
	}

}
