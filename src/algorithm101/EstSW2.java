package algorithm101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstSW2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxCount=0;
        for (int i=0;i<A.length;i++) {
            int count=doJob(A,i);
            if(maxCount<count){
               maxCount=count;
           }

        }

        return maxCount;

    }

    public int doJob(int[] arr, int pos){

        int target = pos;

        int nextIdx = arr[pos];

        int count = 1;

        while(true){

            count++;

            int next = arr[nextIdx];

            if(arr[next] == target) {
                break;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        EstSW2 sw2=new EstSW2();
        int[] A={5,4,0,3,1,6,2};
        System.out.println(sw2.solution(A));
    }
}


