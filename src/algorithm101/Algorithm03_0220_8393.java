package algorithm101;

import java.util.Scanner;

public class Algorithm03_0220_8393 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++){

            sum = sum + N - i;



        }
        System.out.println(sum);
    }
}
