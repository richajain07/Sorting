import java.util.ArrayList;

public class BubbleSort {
    public static void main(String args[])
    {
        BubbleSort object = new BubbleSort();
        System.out.println("sorting using Bubble sort");
        ArrayList<Integer> intArray = new ArrayList<>() ;
        intArray.add(5);
        intArray.add(8);
        intArray.add(3);
        intArray.add(9);
        intArray.add(4);
        intArray.add(1);
        intArray.add(7);
        object.doBubbleSort(intArray);
    }

    private void doBubbleSort(ArrayList<Integer> intArray) {
        for (int i = 0; i < intArray.size() - 1; i++) {

            for (int j = intArray.size() - 1; j > i; j--) {

                if (intArray.get(j) < intArray.get(j - 1)) {
                    //swap
                    Integer temp = intArray.get(j);
                    intArray.set(j,intArray.get(j-1));
                    intArray.set(j-1,temp);
                }
            }

        }

        for(Integer i :intArray){
            System.out.println(i);
        }
    }
}
