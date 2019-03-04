package algorithm101.baekjoon02;

import java.util.Scanner;

public class Algorithm02_0214_2839 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sugar = scan.nextInt();

        int bag5 = sugar/5;

        int bag3 = sugar%5/3;

        double rest = (double)sugar%5/3 - Math.floor(sugar%5/3);

       // double sum = bag3 + bag5;

        if (rest>0){

            for (int i=bag5;i>0;i--){

                if ((sugar - i*5)%3==0){

                    int temp = (sugar - i*5)/3;

                    System.out.println(i+temp);

                    return;
                }

            }

            if (sugar%3==0 && (sugar/3)>(bag3+bag5)){
                System.out.println(sugar/3);
                return;
            }

            System.out.println(-1);

            return;
        }

        System.out.println(bag3+bag5);

    }


}
