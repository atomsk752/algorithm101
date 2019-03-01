package algorithm101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm04_0301_1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        double[] nums = new double[N];

        for (int i = 0; i < N; i++) {

            nums[i] = Integer.parseInt(arr[i]);

        }

        Arrays.sort(nums);

        double avg = 0.0;

        for (int i = 0; i < N; i++) {

            avg += nums[i]/nums[N-1]*100;

        }

        System.out.printf("%.2f", avg/N);

    }

}
