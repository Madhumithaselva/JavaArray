package se.lexicon;

import java.util.Arrays;
import java.util.Random;

public class Ex13RandomNumberInArray {
    public static void main(String[] args){
        int size=10;
         int numArray1[]=new int[size];
         int numArray2[]=new int[size];
         fillArray(numArray1);
        System.out.println("Given array is : ");
        System.out.println(Arrays.toString(numArray1));
        copyArray(numArray1,numArray2);
        System.out.println("Copied array is:");
        System.out.println(Arrays.toString(numArray2));

    }
    public static void fillArray(int[] array){
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]= random.nextInt(100);
        }
    }
    public static void copyArray(int[] array1,int[] array2){
        int frontIndex=0;
        int rearIndex=array2.length-1;
        for (int num:array1){
            if(num%2==0){
                array2[rearIndex]=num;
                rearIndex--;
            }
            else {
                array2[frontIndex]=num;
                frontIndex++;
            }
        }

    }

}
