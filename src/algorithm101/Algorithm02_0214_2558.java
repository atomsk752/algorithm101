package algorithm101;

import java.util.Scanner;

public class Algorithm02_0214_2558 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        while (a<=0 || b>=10){
            System.out.println("다시써라");
            a = scan.nextInt();
            b = scan.nextInt();
        }

        System.out.println(a+b);


    }

}
