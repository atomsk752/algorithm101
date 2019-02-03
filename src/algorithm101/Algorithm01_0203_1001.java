package algorithm101;

import java.util.Scanner;

public class Algorithm01_0203_1001 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		while (a <= 0 || b >=10) {
			System.out.println("다시 입력하세요");
			a = scan.nextInt();
			b = scan.nextInt();
			
		}
		
		System.out.println(a - b);
		scan.close();
	}

}