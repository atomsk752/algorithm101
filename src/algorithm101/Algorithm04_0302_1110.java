package algorithm101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm04_0302_1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int flag = N;

        int count = 0;

        while (true) {

            N = N%10*10 + (N/10 + N%10)%10;

            count++;

            if (flag==N){

                System.out.println(count);
                break;

            }
        }



    }


}
