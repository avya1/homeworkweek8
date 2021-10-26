import javax.sound.midi.Soundbank;
/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static

 */
import java.util.Scanner;
public class EvenDigitSum11 {
    public static int getEvenDigitSum(int number) //static method
    {
        int total = 0, ld;
        //getting sum of even digit in a number
        if (number >= 0) {
            for (total = 0; number != 0; number /= 10) {
                ld = number % 10;
                if (ld % 2 == 0) {
                    total = total + ld;
                }
            }
        } else if (number < 0) {
            return -1;
        }
        return total;
    }
    public static void main(String[] args) //main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find  sum of even digits of the number");
        int n = sc.nextInt();
        System.out.println(getEvenDigitSum(n));//calling static method
    }
}
