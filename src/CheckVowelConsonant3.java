/*
3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;
public class CheckVowelConsonant3 {
    public static void checkVOrC(char c) {
        {
           if(c =='a' || c =='e' || c =='i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                System.out.println("Input letter is Vowel");
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                System.out.println("Input letter is Consonant");
            } else{
               System.out.println("Invalid input");
           }
        }
    }
    public static void main(String[] args) //main method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any letter to check ist vowel or consonant :");
        char c=sc.next().charAt(0);
        sc.close();//close scanner class
        checkVOrC(c);
    }
}
