package algorithm101.baekjoon04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm04_0301_10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {

            nums[i] = Integer.parseInt(arr[i]);

            if (nums[i]<X){

                System.out.print(nums[i]+" ");

            }

        }

    }

}
