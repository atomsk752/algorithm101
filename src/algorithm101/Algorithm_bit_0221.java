package algorithm101;

public class Algorithm_bit_0221 {

    public static void main(String[] args) {
        int[] arr = { -10, -3, 5, 6, -20 };
        findMaxProduct(arr);
    }

    public static void findMaxProduct(int[] arr) {


        // 배열에 있는 숫자를 서로 곱하여 최대값이 나오는 조합을 구하기



        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        int min = arr[0]*arr[1];
        int max = arr[arr.length-1]*arr[arr.length-2];
        if (min>max) {
            System.out.println(arr[1]+""+arr[0]);
        }else {
            System.out.println(arr[arr.length] +""+ arr[arr.length-1]);
        }

        return;

    }
}
