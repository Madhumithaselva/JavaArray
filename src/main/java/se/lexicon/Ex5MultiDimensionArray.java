package se.lexicon;

public class Ex5MultiDimensionArray {
    public static void main(String[] args){
        //Create a 2D array
        String[][] countryCityArray= new String[2][2];

        //Assign values to it
        countryCityArray[0][0]="France";
        countryCityArray[0][1]="Paris";
        countryCityArray[1][0]="Sweden";
        countryCityArray[1][1]="Stockholm";

        for (int i = 0; i < countryCityArray.length; i++) {
            for (int j = 0; j < countryCityArray[i].length; j++) {
                System.out.print(countryCityArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }


    }
