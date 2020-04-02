package train;

import java.util.Scanner;

public class hW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value:");

        int value = scanner.nextInt();
        System.out.println(check(value));
        int[] arr = {10, 9, 8, 1, 7, 6, 5, 4, 3, 2};
        System.out.println(minVal(arr));
        System.out.println(fact(value));

    }
    public static String check(int value) {
        if (value > 1 && value < 6)
            return "value is in 2-5 range";
        else return "value is out of 2-5 range";
    }

    public static int minVal(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[0];
    }

    public static int fact(int value) {
            int result;
            if(value == 1) return 1;
            result = fact(value - 1) * value;
            return result;
    }


}
