import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public static void main(String args[]) {
        SelectionSort object = new SelectionSort();
        ArrayList<Integer> intArray = new ArrayList<>() ;
        intArray.add(5);
        intArray.add(8);
        intArray.add(3);
        intArray.add(9);
        intArray.add(4);
        intArray.add(1);
        intArray.add(7);
        System.out.println("array length is :"+intArray.size());
        System.out.println("sorting using inbuilt method : ");
        Collections.sort(intArray);
        for(Integer i:intArray){
            System.out.println(i);
        }
        System.out.println("sorting using selection sort");
        ArrayList<Integer> intArray2 = new ArrayList<>() ;
        intArray2.add(5);
        intArray2.add(8);
        intArray2.add(3);
        intArray2.add(9);
        intArray2.add(4);
        intArray2.add(1);
        intArray2.add(7);
        object.doSelectionSort(intArray2);
    }

    void doSelectionSort(ArrayList<Integer> arr) {

        //run outer loop for 0 to length -1
        for (int i = 0; i < arr.size() - 1; i++) {
            int minIndex = i;
            //run inner loop for i+1 to length
            for (int j = i + 1; j < arr.size(); j++) {

                if (arr.get(j) < arr.get(i)) {
                    //updateMinimum index
                    minIndex = j;
                    int currentIndexValue = arr.get(i);
                    arr.set(i,arr.get(minIndex));
                    arr.set(minIndex,currentIndexValue);
                }
            }

        }
        printArray(arr);
    }

    private static void printArray(ArrayList<Integer> intArray) {
        for( Integer i:intArray){
            System.out.println(i);
        }
    }
}
