package se.lexicon;

import java.util.Arrays;

public class Ex4ArrayCopy {
    public static void main(String[] args){
        //Declare the array1
        int[] array1={1, 15, 50};

        //Print the array1
        System.out.print("Elements from first array:");
        printArray(array1);

        //Copy the array1 to array2
        int[] array2 = Arrays.copyOf(array1,array1.length);

        //Print the copied array
        System.out.print("\nElements from second array:");
        printArray(array2);

    }
    public static void printArray(int[] intArray) {
        for (int num : intArray) {
            System.out.print(num + "\t");
        }
    }

}
