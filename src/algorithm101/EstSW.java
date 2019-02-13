package algorithm101;

import java.util.Arrays;

public class EstSW {

    public int solution(int[] ranks) {
        // write your code in Java SE 8

        Arrays.sort(ranks);
        System.out.println(Arrays.toString(ranks));
        int count=0;

        for(int i = 0; i < (ranks.length -1); i++ ){

            for (int j = i+1; j < ranks.length; j++){

                if (ranks[j]-ranks[i]==1){
                    count++;
                    System.out.println("j:"+ranks[j] +" i:" +ranks[i]);
                    break;
                }else if (ranks[j]-ranks[i] > 1){
                    break;


                }

            }

        }

        return count;
    }

    public static void main(String[] args) {
        EstSW sw=new EstSW();
        int [] ranks={4, 4, 3, 3, 1, 0};
        sw.solution(ranks);
    }

}
