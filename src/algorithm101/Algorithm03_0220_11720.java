package algorithm101;

import java.util.Scanner;

public class Algorithm03_0220_11720 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        String numbers = scan.next();

        int result = 0;

        for (int i = 0; i < cnt; i++) {

            result += Integer.parseInt(numbers.substring(i, i+1));

        }

        System.out.println(result);

    }
}
