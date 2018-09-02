/******************************************************************************
 *  Insertion Sort Algorithm Java Implementation
 *  Solution Based on Insertion-Sort algorithm described in Thomas H. Cormen
 *  "Introduction to Algorithms" book, Chapter 2, page 18.
 ******************************************************************************/

public class InsertionSort {

    public static int[] InsertionSort(int[] inputArray) {

        int key;
        int i;

        for (int j = 1; j < inputArray.length; j++){
            key = inputArray[j];
            i = j - 1;
            while (i >= 0 && inputArray[i] > key){
                inputArray[i + 1] = inputArray[i];
                i = i - 1;
            }
            inputArray[i + 1] = key;
        }

        return inputArray;
    }
}
