package se.lexicon;

import java.util.Arrays;

public class Ex9CopyArray {
    public static void main(String[] args){
        //Declare a integer array with 5 values
        int[] intArray={10, 20, 30, 40, 50};
        System.out.println("Array given:");
        for (int num:intArray){
            System.out.print(num+" ");
        }

        //System.out.println(intArray.length);
        /*int length=intArray.length+1;
        System.out.println(length);*/

        //Call to a method to add an element in the array
       intArray= addElement(intArray,60);

       //Display the array after adding an element
        System.out.println("\nArray after adding an element: ");
        for (int num:intArray){
            System.out.print(num+" ");
        }

    }
    public static int[] addElement(int[] oldArray,int newElement){
        //int len= oldArray.length;
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length +1);
        newArray[newArray.length -1] = newElement;
        return newArray;
    }
}
