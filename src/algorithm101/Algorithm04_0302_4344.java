package algorithm101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm04_0302_4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {

            String[] arr = br.readLine().split(" ");

            int N = Integer.parseInt(arr[0]);

            int[] nums = new int[N];

            int avg = 0;

            int count = 0;

            for (int j = 0; j < N; j++) {

                nums[j] = Integer.parseInt(arr[j+1]);

                avg += nums[j];

            }

            for (int k:nums) {

                if (k>avg/N){

                    count++;

                }

            }


            System.out.printf("%.3f",(double) count/N*100);
            System.out.println("%");

        }



    }

}
