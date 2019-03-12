package algorithm101.baekjoon07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm07_0311_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[26];
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String input = br.readLine();
        Arrays.fill(arr, -1);

        for (int i = 0; i < input.length(); i++) {

            arr[abc.indexOf(input.charAt(i))] = input.indexOf(input.charAt(i));

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

        }

        //알파벳 빈도수 계산(잘못만듦)
/*        for (int i = 0; i < input.length(); i++) {

            arr[abc.indexOf(input.charAt(i))] += 1;

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0){
                System.out.println(-1);
            }else {
                System.out.println(arr[i]);
            }
        }*/

    }

}
