package se.lexicon;

import java.util.Arrays;

public class Ex3StringSort {
    public static void main(String[] args){
        String[] strArray= {"Paris", "London", "New York", "Stockholm"};
        //Print the array before sorting
        System.out.println("String array: " + Arrays.toString(strArray));

        Arrays.sort(strArray,String.CASE_INSENSITIVE_ORDER);

        //Print the sorted array
        System.out.println("Sort string array: " + Arrays.toString(strArray));
    }
}
