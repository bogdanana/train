package train;

public class queue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5, 6, 10, 2};
        System.out.println(checker(arr));

    }

    public static int checker(int[] arr) {
        int kassa1 = 0;
        int kassa2 = 0;
        kassa1 = kassa1 + arr[0];
        for (int i=1; i<arr.length; i++) {
            if (kassa1 > kassa2) kassa2 = kassa2 + arr[i];
            else if (kassa1 == kassa2) kassa1 = kassa1 + arr[i];
            else kassa1 = kassa1 + arr[i];
        }
        if (kassa1 > kassa2) return kassa1;
        else return kassa2;
    }
}
