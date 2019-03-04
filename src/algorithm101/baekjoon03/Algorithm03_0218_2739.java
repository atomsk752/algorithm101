package algorithm101.baekjoon03;

import java.util.Scanner;

public class Algorithm03_0218_2739 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i < 10; i++){

            int j = N * i;
            System.out.println(N + " * " + i + " = " + j);

        }


    }


}
