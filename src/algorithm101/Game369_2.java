package algorithm101;

import java.util.Scanner;

public class Game369_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int cnt = 1; cnt <= N; cnt++) {
            String strCnt = String.valueOf(cnt); // 문자열 변환
            boolean isChark = false; // 3 6 9 해당여부 저장
            for (int i = 0; i < strCnt.length(); i++) {
                char chk = strCnt.charAt(i);
                // 해당 수의 앞에서부터 i번째 숫자부터 검사
                if (chk == '3' || chk == '6' || chk == '9') {
                    // 3 6 9 해당되면 짝 출력
                    System.out.print('짝');
                    isChark = true;
                }
            }
            if (!isChark) {
                // 3 6 9 해당 되지 않았다면 수 표시
                System.out.print(strCnt);
            }
            if (cnt % 10 == 0) {
                // 10 단위로 줄바꿈
                System.out.println();
            } else {
                // 중간수면 한 칸 띄우기
                System.out.print(' ');
            }
        }


    }
}
