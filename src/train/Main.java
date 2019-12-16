package train;

public class Main {

    public static void main(String[] args) {
/*
        // if Prime number

        int x = 7;
        int result = 0;
        boolean isPrime;
        if (x < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= x/i; i++) {
            if ((x % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime number");
        else System.out.println("Not a prime number");
*/
/*
        // for each cycle

        int y[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i=0; i < 10; i++) { //for (int i: y)
            System.out.println("Value: " + y[i]);
            sum += i; //sum += x[i];
        }
        System.out.println("Sum: " + sum);

 */
/*
    //massive
        int days[];
        days = new int[12]; //number of elements
        //or
        int month_days [] = new int [12];

        month_days [1] = 28;
        //or
        int sum = 0;
        int month_days_1 [] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i=0; i<12; i++) {
            int n = i + 1;
            sum += month_days_1[i];
            System.out.println("month #" + n + ":" + month_days_1[i]);
        }
        System.out.println("total numb of days: " + sum);

        double numbers [] = new double [10];
        int k = 0;
        // fill the massive
        for (int i = 0; i < 10; i++) {
            numbers[i] = k;
            k++;
            System.out.println("value: " + numbers[i]);
        }
*/
        //massive with for each cycle
        int nums [] = new int [10];
        int k = 0;
        for (int i:
        nums) {
            nums[i] = k;
            k++;
            System.out.println("value: " + nums[i]);
        }

        //two dim mass with for each cycle
        double numss [] [] = new double [3] [5];
        double o = 0;
        for(double[] i:
        numss)
            for(double[] j:
            numss) {
                numss [i][j] = o;
                o++;
            }






/*
        // for cycle in two dimensional massive

        int sum = 0;
        int nums [] [] = new int [3] [5];

        // fill the massive
        for(int i = 0; i < 3; i++)
            for( int j = 0; j< 5; j++)
                nums[i] [j] = (i + 1)*(j + 1);
            // use for cycle to log out values and summate
            for(int x = 0; x < 3; x++) {
                for(int y = 0; y < 5; y++) {
                    System.out.println("Value: " + y);
                    sum = sum + y;
                }
            }
        System.out.println("Sum:" + sum);
*/
    }
}

