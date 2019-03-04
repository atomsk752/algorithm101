package algorithm101.baekjoon03;

import java.util.Scanner;

public class Algorithm03_0219_1924 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        int[] days = new int[13];
        days[1] = days[3] = days[5] = days[7] = days[8] = days[10] = days[12] = 31;
        days[4] = days[6] = days[9] = days[11] = 30;
        days[2] = 28;

        int sum = 0;

        for (int i = 0; i <= 13; i++){

            if (i == x){
                break;
            }

            sum = sum + days[i];

        }

        sum = sum + y;

        switch (sum % 7){
            case 0 :
                System.out.println("SUN");
                break;
            case 1 :
                System.out.println("MON");
                break;
            case 2 :
                System.out.println("TUE");
                break;
            case 3 :
                System.out.println("WED");
                break;
            case 4 :
                System.out.println("THU");
                break;
            case 5 :
                System.out.println("FRI");
                break;
            case 6 :
                System.out.println("SAT");
                break;
        }

    }
}
