package algorithm101.baekjoon02;

import java.util.Scanner;

public class Algorithm02_0211_1008 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        scan.close();

        double c = a/b;

        if (a > 0 && b < 10){
            //printf = printIn + String.format - 개행
            System.out.println(c);
            System.out.println(String.format("%.9f", c));
            //printf는 개행이 없습니다. \n으로 개행해야함
            System.out.printf("%.9f\n", c);

            //Math.round는 뒷자리가 0일때는 그냥 없애고 표기합니다
            System.out.println(Math.round(c*1000000000)/1000000000.0);

        }

    }
}
