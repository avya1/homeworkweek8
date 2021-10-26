/*
12. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
import java.util.Scanner;
public class PrimeNumber12 {
    public void checkPrime(int a) {
        boolean f=false;
        //for loop and if else to get number is prime or not
        for (int i = 2; i <= a / 2; i++) {
            if (a % 2 == 0) {
                f = true;

                break;
            }
        }if(!f) {

            System.out.println(" Number " + a + " is prime number");
        }
        else{
            System.out.println("Number " + a + " is not a prime number");
        }
    }

    public static void main(String[] args) //main method
    {
        PrimeNumber12 primeNumber12=new PrimeNumber12();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to check it is Prime number or not= ");
        int a=scanner.nextInt();
        scanner.close();
        primeNumber12.checkPrime(a);//calling instance
    }
}
