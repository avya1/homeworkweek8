/*
13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
 */
import java.util.Scanner;
public class SharedDigit13 {
    public boolean hasSharedDigit(int a,int b )//instance method
    {
        int la=a/10,lb=b/10,ra=a%10,rb=b%10;
        //if else statement to check two number share same digit or not
        if(a>=10 && b<=99){
            if(la==lb||la==rb||ra==lb||ra==rb){
                return true;
            }
            else {
                return false;
            }
        }else
            return false;


    }

    public static void main(String[] args) //main method
    {
        SharedDigit13 sharedDigit13=new SharedDigit13();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two no to check they share same digit or not");
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        scanner.close();
        System.out.println(sharedDigit13.hasSharedDigit(a,b));//calling instance method with the help of object
    }
}
