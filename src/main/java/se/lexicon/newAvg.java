package se.lexicon;

public class newAvg {
            public static void main(String[] args) {
            // Set up an array with the given values
            int[] numbersArray = {43, 5, 23, 17, 2, 14};

            // Calculate the sum of the numbers
            int sum = 0;
            for (int num : numbersArray) {
                sum += num;
            }

            // Calculate the average
            double average = (double) sum / numbersArray.length;

            // Print the average
            System.out.println("Average is: " + average);
        }
    }
