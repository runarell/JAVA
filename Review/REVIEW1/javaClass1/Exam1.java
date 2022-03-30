package javaClass1;

public class Exam1 {
    public static void main(String[] args) {
        int[] arr = arrMaker(100);
        // int i = 0;
        // for (int e : arr) {
        // System.out.print(e + " ");
        // if (i % 10 == 0) {
        // System.out.println();
        // }
        // i++;
        // }

    }

    public static int[] arrMaker(int no) {
        int[] result = new int[no];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static boolean numCheack(int no) {
        boolean result = false;
        int digit = (int) (Math.log10(no)); // 자리수

        for (int i = 1; i < digit + 1; i++) {
            /**
             * 1의 자리 a%10
             * 2의 자리 (int)(a/10)%10
             */

        }

        if (no % 3 == 0) {
            result = true;
        }
        return result;
    }

}
