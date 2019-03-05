package algorithm101.baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm06_0305_8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] cases = new String[N];

        for (int i = 0; i < N; i++) {

            cases[i] = br.readLine();

        }

        for (String result:cases) {

            int score = 0;

            int sum = 0;

            for (int i = 0; i < result.length(); i++) {

                if (result.charAt(i) == 'O'){

                    score++;

                    sum += score;

                }else {

                    score = 0;
                }

            }

            System.out.println(sum);

        }

    }

}
