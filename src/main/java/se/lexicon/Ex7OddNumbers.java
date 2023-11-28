package se.lexicon;

public class Ex7OddNumbers {
    public static void main(String[] args){
        int[] intArray={1, 2, 4, 7, 9, 12, 43, 66, 27};
        System.out.println("Array:");
        for (int num:intArray)
        {
            System.out.print(num+"\t");
        }
        System.out.println("\n Odd Array :");
        findOddNumber(intArray);

    }
    public static void findOddNumber(int[] arrayToFind){
        for (int num:arrayToFind){
                if ((num%2)==1)
                System.out.print(num+"\t");

        }
       }
}
