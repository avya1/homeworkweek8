/*
15. Display left angle triangle of * using nested for loops
        *
      * *
    * * *
  * * * *
* * * * *
 */
public class Program15 {
    public static void main(String[] args)//main method
    {
        int i, j, n= 5;
        for (i=0; i<n; i++)
        {
            for (j=2*(n-i); j>=0; j--)//inner for loop to print space between two stars
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}


