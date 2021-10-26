import java.util.Scanner;

/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    static int i=1;
    public static void main(String[] args) {
        int max = 0, min= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to get maximum and minimum of them and any alphabet or symbol to end:");
        while (sc.hasNextInt()) {
            System.out.println("Enter  number :");
            int n = sc.nextInt();
            if(i==1)
            {
                max=n;
                min=n;
                i++;
            }else if (n > max) {
                max = n;
            }
            else if (n < min) {
                 min= n;
            }
        }
        System.out.println("Maximum number enter by user : " + max);
        System.out.println("minimum number enter by user  : " + min);
    }
    }




