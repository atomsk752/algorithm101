package algorithm101.baekjoon02;

import java.util.Scanner;

public class Algorithm02_0211_10998 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a < 0 || b > 10){

            System.out.println("error : a > 0 or b < 10");
            System.out.println("type again");
            a = scan.nextInt();
            b = scan.nextInt();

        }

        int c = a*b;

        System.out.println(c);
        scan.close();

    }

}
