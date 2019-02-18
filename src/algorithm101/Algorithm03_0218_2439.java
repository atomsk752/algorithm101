package algorithm101;

import java.util.Scanner;

public class Algorithm03_0218_2439 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++){

            for (int j = 0; j <= N-i-2; j++){

                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++){

                System.out.print("*");
            }

            System.out.println();
        }
//case 2
/*        for (int i = N; i >=0; i--){

            String star = "";

            for (int j = 0; j < N; j++){

                if (i>j){
                    star += " ";
                }else {
                    star += "*";
                }

            }
            System.out.println(star);

        }*/



    }

}
