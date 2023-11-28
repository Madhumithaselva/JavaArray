package se.lexicon;
import java.text.DecimalFormat;

public class Ex6FindingAverage {
    public static void main(String[] args){
        //Declare the integer array and variables
        int[] intArray={43, 5, 23, 17, 2, 14};
        double average;

        //call to a method called "avg()" to find the average of given no.s
        average=avg(intArray);

        //Declare the decimal format pattern to trim hte precision
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        // Format the double value with trimmed precision
        String trimmedValue = decimalFormat.format(average);
        System.out.println("Average of given no.s are: "+trimmedValue);

    }

    public static double avg(int[] numArray){
        double total=0;
       //Find sum of given numbers
        for (int num:numArray){
            total+=num;
        }
        //System.out.println(total);
        double avg=total/numArray.length;
        return avg;
    }

}
