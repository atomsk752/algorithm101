package algorithm101.baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm06_0308_10039 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {

            score[i] = Integer.parseInt(br.readLine());

        }

        int sum = 0;

        for (int i = 0; i < score.length; i++) {

            if (score[i]<40){

                score[i] = 40;

                sum += score[i];

            }else {

                sum += score[i];
            }

        }

        System.out.println(sum/5);

    }

}
