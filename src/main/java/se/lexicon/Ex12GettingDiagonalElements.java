package se.lexicon;

public class Ex12GettingDiagonalElements {
    public static void main(String[] args) {
        int[][] numberArray = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        printArray(numberArray);
        System.out.println("Diagonal elements are:");
        printDiagonalElements(numberArray);
    }
    public static void printDiagonalElements(int[][] array){
        int rows= array.length;;
        int cols=array[0].length;
        if (rows!=cols){
            System.out.println("Sorry..!!! Given array is not square.Diagonal elements cannot be determined");
            return;
        }
        for(int i=0;i<rows;i++){
            System.out.print(array[i][i]+" ");
        }
        System.out.println();
    }
    public static void printArray(int[][] arrayToPrint) {
        System.out.println("The given array is:");
        for (int[] num : arrayToPrint) {
            for (int j : num) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
