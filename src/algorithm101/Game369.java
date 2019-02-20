package algorithm101;

import java.util.Scanner;

public class Game369 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();


        int res, numberOf369 = 0;

        if (N >=1 && N<=99){
            res = N % 10;
            if (res == 3 || res == 6 || res == 9){
                numberOf369++;
                res = N / 10;
            }
            if (res == 3 || res == 6 || res == 9) {
                numberOf369++;
            }
            if (numberOf369 == 1){
                System.out.println("짝");
            }
            else if (numberOf369 == 2) {
                System.out.println("짝짝");
            }
            else{
                System.out.println("3이 없음");
            }

        }
        else{
            System.out.println("Out of range");
        }





    }

}
