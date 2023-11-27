package se.lexicon;

import java.io.InputStream;
import java.util.Scanner;

public class Ex2IndexOfArray {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 3, 6, 7, 2, 9};
        int position;
        int elementToFind;
        System.out.println("Please enter an element to find in an array:");
        System.out.println(">");
        Scanner input = new Scanner(System.in);
        elementToFind = input.nextInt();
        position = indexOf(intArray, elementToFind);
        if (position != -1) {
            System.out.println("Index position of " + elementToFind + " is " + position);
        } else {
            System.out.println("Number " + elementToFind + " is not found in array");
        }
    }
    public static int indexOf(int[] arrayToFind,int arrayElement){
            for(int i=0;i<arrayToFind.length;i++) {
                if (arrayToFind[i] == arrayElement) {
                    return i;
                }
            }
                                  return -1;
            }


    }
