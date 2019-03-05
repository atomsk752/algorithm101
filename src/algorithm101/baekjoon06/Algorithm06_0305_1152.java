package algorithm101.baekjoon06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm06_0305_1152 {

    public static void main(String[] args) throws IOException {

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Use Tokenizer
        String text = br.readLine();

        StringTokenizer st = new StringTokenizer(text);

        System.out.println(st.countTokens());
*/

        // Use split

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine().trim();

        String[] strArr = text.split(" ");

        if (!text.isEmpty()){

            System.out.println(strArr.length);

        }else {

            System.out.println("0");

        }

    }

}
