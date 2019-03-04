package algorithm101.baekjoon01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algorithm01_0203_11718 {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> inputs = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			String input = scan.nextLine();
			String pattern = "^[ㄱ-ㅎ가-힣a-zA-Z0-9]*$";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(input);
			
			//아무입력이 없으면 출력 후 종료
			if (input.equals("")) {
				System.out.println("입력완료");
				
				for (int j = 0; j < inputs.size(); j++) {
					System.out.println(inputs.get(j));
				}
				scan.close();
				break;
			//특수문자나, 입력값이 100자 이상, 공백으로 시작하거나 끝날 때 다시 입력. 다시 입력은 카운트하지 않는다
			}else if (m.matches()==false || input.length()>100 || input.startsWith(" ") || input.endsWith(" ")) {
				System.out.println("다시 입력해주세요");
				i = i-1;
			//조건에 걸리지 않으면 계속 입력받음
			}else {
				inputs.add(input);
				System.out.println("added");
			}		
			
		}//for end
		
	}//main end

}
