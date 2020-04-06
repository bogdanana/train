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
        System.out.println(fib(value));
        System.out.println(alg(value));

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

    public static int alg(int value) {
        int pow = value*value;

        int len = Integer.toString(pow).length();
        int[] arr = new int[len];
        for(int j=0; pow >0; j++) {
            arr[len-1-j] = pow%10;
            pow=pow/10;
        }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }

        int result = 0;
        for( int temp=0; temp < arr.length; temp++){
            result*=10;
            result+=arr[temp];
        }
        return result;
    }


    public static int fib(int n) {
        if(n>1)
            return fib(n-2) + fib(n-1);
        else
            return n;
    }


}
