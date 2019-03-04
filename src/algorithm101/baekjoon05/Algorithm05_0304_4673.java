package algorithm101.baekjoon05;

public class Algorithm05_0304_4673 {

    public static void main(String[] args) {

        boolean[] selfNumArr = new boolean[10036];

        for (int i = 1; i < 10000; i++) {

            selfNumArr[getDn(i)] = true;

        }

        for (int i = 1; i < selfNumArr.length; i++) {

            if (!selfNumArr[i] && i<=10000){

                System.out.println(i);

            }

        }

    }

    private static int getDn(int n){

        int dn = n;

        while(n>0){

            dn += n % 10;
            n /= 10;

        }

        return dn;

    }


}
