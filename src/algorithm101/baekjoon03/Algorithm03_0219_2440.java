package algorithm101.baekjoon03;

import java.util.Scanner;

public class Algorithm03_0219_2440 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int j = 0; j < N; j++) {

            for (int i = 0; i < N-j; i++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }
}
