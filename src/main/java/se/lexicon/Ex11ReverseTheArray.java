package se.lexicon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex11ReverseTheArray {
    public static void main(String[] args) {
        int[] numArray = new int[0]; //Declares an array with value 0
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter an integer (or 0 to quit)");
            userInput = input.nextInt();
            if (userInput == 0) {
                break;
            }
            numArray = Arrays.copyOf(numArray, numArray.length + 1);
            numArray[numArray.length-1]=userInput;
        } while (true);
            System.out.println("Array entered by user: ");
            for (int num : numArray) {
                System.out.print(num + " ");
            }

        int left=0;
        int right=numArray.length-1;
        while(left<right){
            int temp=numArray[left];
            numArray[left]=numArray[right];
            numArray[right]=temp;
            left++;
            right--;
        }
        System.out.println("\nReversed array is:");
        for(int num:numArray){
            System.out.print(num+" ");
        }
    }

}
