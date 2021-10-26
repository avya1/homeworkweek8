/*
7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
gives us 0+0 and the sum is 0.
* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
gives us 5+5 and the sum is 10.
* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
import java.util.Scanner;

public class FirstAndLastDigitSum7 {

        public static void main (String[]args)//main method
        {
            //static area
            //static method called directly
            System.out.println(sumFirstAndLastDigit(252));  //  4
            System.out.println(sumFirstAndLastDigit(257));  //  9
            System.out.println(sumFirstAndLastDigit(0));    //  0
            System.out.println(sumFirstAndLastDigit(5));    //  10
            System.out.println(sumFirstAndLastDigit(-10));  //  -1

        }

    public static int sumFirstAndLastDigit(int number) //static method
    {
        //if else to check number is negative or 0
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            int lD = number % 10; // get last digit of number
            while (number >= 10) {
                number = number / 10;//remove that last digit from number
            }
            int fD = number;
            return (lD + fD);
        }
    }
}

