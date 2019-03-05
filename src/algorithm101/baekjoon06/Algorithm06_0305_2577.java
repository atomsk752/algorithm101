package algorithm101.baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm06_0305_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int B = Integer.parseInt(br.readLine());

        int C = Integer.parseInt(br.readLine());

        int sum = A * B * C;

        int[] numbers = new int[10];
        //개똑똑한 방법 10으로 나눈 나머지 값을 계속 대입한다
        //배열에 하나 씩 카운트를 한다

        while(sum>0){

            numbers[sum%10]++;

            sum /= 10;

        }

        for (int number : numbers) {

            System.out.println(number);

        }

    }

}
