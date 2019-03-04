package algorithm101.baekjoon05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm05_0304_1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1; i <= N; i++) {

            if (checkHn(i)){

                cnt++;

            }

        }

        System.out.println(cnt);

    }

    private static boolean checkHn(int N){

        boolean flag = false;

        int a = N % 10;

        int b = N /10 %10;

        int c = N /100 %10;

        if (N == 1000){

            flag = false;

        }else if(N < 100 || b * 2 == a+c) {

            flag = true;

        }

        return flag;
    }
}
