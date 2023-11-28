package se.lexicon;

public class Ex10MultiplicationTable {
    public static void main(String[] args){
        int[][] multiTable=new int[10][10];
        System.out.println(multiTable.length);
        multiTable=generateMultiplicationTable(multiTable.length);
        System.out.println("=====================================");
        System.out.println("\t\tMultiplication Table");
        System.out.println("=====================================");
        printMultiplicationTable(multiTable);
    }
    public static int[][] generateMultiplicationTable(int size){
        int[][] table = new int[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return table;
    }
    public static void  printMultiplicationTable(int[][] table){
        for (int[] i:table) {
            for (int j:i){
                System.out.print("\t"+j);
            }
            System.out.println();
        }
    }
}
