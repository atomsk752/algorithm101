package algorithm101;

import java.util.Scanner;

public class Algorithm02_0211_10869 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();

        int add = (int) a + (int) b;
        int minus = (int) a - (int) b;
        int multiply = (int) a * (int) b;
        double division = a / b;
        int surplus = (int) a % (int) b;


        if (a < 1 || b > 10000){

            System.out.println("regame");
            scan.close();

        }else {


            System.out.println("+  " + add);
            System.out.println("-  " + minus);
            System.out.println("*  " + multiply);
            System.out.println("/  "  + String.format("%.1f", division));
            System.out.println("%  " + surplus);
            scan.close();


        }

    }


}
