package train;


import java.util.Arrays;
import java.util.Scanner;

public class Main<array, myArray, a> {


    public static void main(String[] args) {

//array sorting
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr length:");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.println("enter " + (i + 1) + " element of array");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = arrLength-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //fibonacci values---------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr length:");
        int arrLength = input.nextInt();
        int[] arr = new int[arrLength];
        int k = 0;
        if (arrLength > 0) {
            arr[0] = 0;
            arr[1] = 1;
            if (arrLength > 1) {
                for (int i=2; i<arrLength; i++) {
                    k = arr[i-1] + arr[i-2];
                    arr[i] = k;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    //found a value in the array----------------------------
    Scanner input = new Scanner(System.in);
        System.out.println("enter a value");
    int x = input.nextInt();
    int o = -1;
    boolean found = false;
    int[] myArr = {0, 3, 5, 8, 10, 12, 100, 1000};
        while (!found) {
        for (int i=0; i<myArr.length; i++) {
            if (myArr[i] == x) {
                found = true;
                System.out.println(i);
            }
        }
    }
        if(found = false) System.out.println(o);
}
        /*
         System.out.println("enter your name:");
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
         System.out.println(str + " hello");
*/



/*
// if Prime number-------------------------------

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
// for each cycle------------------------------------

        int y[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i=0; i < 10; i++) { //for (int i: y)
            System.out.println("Value: " + y[i]);
            sum += i; //sum += x[i];
        }
        System.out.println("Sum: " + sum);

 */
/*
//array------------------------------------
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
/*
//array with for each cycle--------------------------------
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

*/




/*
// for cycle in two dimensional massive--------------

        int sum = 0;
        int nums [] [] = new int [3] [5];

// fill the massive-------------------------------------
        for(int i = 0; i < 3; i++)
            for( int j = 0; j< 5; j++)
                nums[i] [j] = (i + 1)*(j + 1);
// use for cycle to log out values and summate--------------
            for(int x = 0; x < 3; x++) {
                for(int y = 0; y < 5; y++) {
                    System.out.println("Value: " + y);
                    sum = sum + y;
                }
            }
        System.out.println("Sum:" + sum);
*/
/*
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                }
            }
        System.out.println(Arrays.toString(array));
            int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
            boolean needIteration = true;
        while (needIteration) {
                needIteration = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        swap(array, i, i-1);
                        needIteration = true;
                    }
                }
            }
        System.out.println(Arrays.toString(array));


*/

/*
        int[] myArray;
        myArray = new int[]{2, 5, 1, 3, 0, 10};
        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
    }
*/
/*
//bubble sorting----------------------------------------
    private static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
                }
            }
        System.out.println(Arrays.toString(array));
        }
*/
/*
    public static void bubbleSort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( arr[j] > arr[j+1] ){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

*/
/*
        for (int i = 0; i < arrLength; i++) {
            System.out.println("enter " + (i+1) + " element of array");
            arr[i] = input.nextInt();
        }
        */
/*
//insertion sort-------------------------------------------------
int[] array = {10, 2, 10, 3, 1, 2, 5};
System.out.println(Arrays.toString(array));
for (int left = 0; left < array.length; left++) {
	// Вытаскиваем значение элемента
	int value = array[left];
	// Перемещаемся по элементам, которые перед вытащенным элементом
	int i = left - 1;
	for (; i >= 0; i--) {
		// Если вытащили значение меньшее — передвигаем больший элемент дальше
		if (value < array[i]) {
			array[i + 1] = array[i];
		} else {
			// Если вытащенный элемент больше — останавливаемся
			break;
		}
	}
	// В освободившееся место вставляем вытащенное значение
	array[i + 1] = value;
}
System.out.println(Arrays.toString(array));
 */
/*
//Quick sort---------------------------------------
public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
}

 */
/*
//сортировка расческой-------------------------------------------
public static void qSort(int[] A, int low, int high) {
int i = low;
int j = high;
int x = A[(low+high)/2];
do {
while(A[i] < x) ++i;
while(A[j] > x) --j;
if(i <= j){
int temp = A[i];
A[i] = A[j];
A[j] = temp;
i++; j--;
}
} while(i < j);
if(low < j) qSort(A, low, j);
if(i < high) qSort(A, i, high);
}

 */


/*

*/



/*
//fibonacci recursion----------------------------------
static class Rec2 {
    public static void main(String[] args) {

        RecTest ob = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}

    static class RecTest {
        int[] values;

        RecTest(int n) {
            values = new int[n];
        }

        void printArray(int n) {
            if (n == 0) return;
            else printArray(n - 1);
            System.out.println(values[n - 1]);
        }
    }


}
*/
/*
//found a value in the array----------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("enter a value");
        int x = input.nextInt();
        int o = -1;
        boolean found = false;
        int[] myArr = {0, 3, 5, 8, 10, 12, 100, 1000};
        while (!found) {
            for (int i=0; i<myArr.length; i++) {
                if (myArr[i] == x) {
                    found = true;
                    System.out.println(i);
                }
            }
        }
        if(found = false) System.out.println(o);
        }
*/
/*
//classes-------------------------------------
    static class Box {
        double wid;
        double hei;
        double dep;

        double volume() {  // if return use type, if no return use void
            return wid*hei*dep;
        }

        void setDim(double w, double h, double d) {
            wid = w;
            hei = h;
            dep = d;
        }
    }

    static class BoxDemo {
        public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.setDim (10, 5, 2);
        vol = myBox.volume();

        System.out.println(vol);
        }
    }
 */
    }
}

















