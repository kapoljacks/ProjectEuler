/**
 * Created by Kevin on 1/8/2017.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int processing = 1;  // Represents the current Fibonacci number being processed
        int nextInSequence = 2;  // Represents the next Fibonacci number in the sequence

        while (processing <= 4000000) {
            if (processing % 2 == 0) //if number is equal
                sum += processing; // add to sum
            int inTheHole = processing + nextInSequence; // now we are producing the next number in the sequence by adding our two
            processing = nextInSequence; // the number we are looking at is now the number after the last one
            nextInSequence = inTheHole; // this is 3 the first go-around, we are saving it
        }
        System.out.println(sum);

    }
}


