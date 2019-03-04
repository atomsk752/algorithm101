package algorithm101.baekjoon03;

import java.util.Scanner;

public class Algorithm03_0218_2438 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();

        }


    }

}
