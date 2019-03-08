package algorithm101.baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm06_0308_2920 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[8];

        int[] ascending = {1,2,3,4,5,6,7,8};

        int[] descending = {8,7,6,5,4,3,2,1};

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(st.nextToken());

        }

        if (Arrays.equals(numbers, ascending)){
            System.out.println("ascending");
        }else if (Arrays.equals(numbers, descending)){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }

    }

}
