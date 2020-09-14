import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayToSort = new int[0];

        System.out.println("Choose a random number! (Type 'q' to exit)");

        while (!scan.hasNext("q")){

            int[] tempArray = new int[arrayToSort.length + 1];
            int chosenNumber = scan.nextInt();

            for (int i = 0; i < arrayToSort.length; i++){
                tempArray[i]=arrayToSort[i];
            }
            tempArray[tempArray.length -1]=chosenNumber;
            arrayToSort = tempArray;
            System.out.println(Arrays.toString(arrayToSort));

        }
        arraySorted(arrayToSort);
        System.out.println("Sorted Array: " + Arrays.toString(arrayToSort));
    }

    public static int[] arraySorted(int[] arrayToSort){

        for (int i = 0; i < arrayToSort.length; i++){
            int tempNumber = arrayToSort[i];
            int j = i-1;

            for (j = 0 ; j < arrayToSort.length; j++){
                if (j >= 0 && arrayToSort[j] > tempNumber){

                    tempNumber = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = tempNumber;

                    j--;
                }
            }
        }
        return arrayToSort;
    }

}

