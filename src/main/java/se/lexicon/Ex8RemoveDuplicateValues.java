package se.lexicon;
import java.util.Arrays;

public class Ex8RemoveDuplicateValues {
    public static void  main(String[] args) {
        int[] arrayWithDuplicate = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println("Array:");
        for (int num:arrayWithDuplicate){
            System.out.print(num+" ");
        }
        int[] arrayWithoutDuplicate = removeDulpicates(arrayWithDuplicate);
        System.out.println("\n Array without duplicate values:");
        for (int num:arrayWithoutDuplicate){
            System.out.print(num+" ");
        }
    }
    public static int[] removeDulpicates(int[] arrayDup){
        int length=arrayDup.length;
        for (int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if (arrayDup[i]==arrayDup[j]) {
                    for (int k = j; k < length - 1; k++) {
                        arrayDup[k] = arrayDup[k + 1];
                    }
                    length--;
                    j--;
                }
            }
          //  System.out.println(arrayDup[i]);
        }
        int[] arrayWODup=Arrays.copyOf(arrayDup, length);
        return arrayWODup;
    }
}

