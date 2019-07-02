package algorithm101.baekjoon05Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm05_0702_10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));

    }
    //잘못된 풀이
/*    static int factorial(int a){

        int result = 1;

        for (int i = 1; i <= a; i++) {

            result = i * result;

        }

        return result;

    }*/

    static int factorial(int a){

        if (a==0) {

            return 1;

        }else {
            return a * factorial(a - 1);
        }

    }


}
