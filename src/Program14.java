/*
14. Write a program in Java to display the pattern like a diamond.
While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class Program14 {
    public static void main(String[] args) //main method
    {
        int i=1,j,n=6;
        while(i<=n)
        {
            j=1;
            while(j++<=n-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print("*");//to print *

            }

            System.out.println();//this println is for taking command to next line
            i++;
        }
        //this loop is for  bottom part of diamond shape
        i=n-1;
        while(i>0)
        {
            j=1;
            while(j++<=n-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print("*");

            }

            System.out.println();
            i--;
        }

    }
}
