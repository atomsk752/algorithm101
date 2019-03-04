package algorithm101.baekjoon03;

import java.util.Scanner;

public class Algorithm03_0220_11721 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i));

            if (i % 10 == 9){
                System.out.println();
            }

        }

    }
}
