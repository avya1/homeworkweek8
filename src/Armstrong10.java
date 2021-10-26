/*
10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
import java.util.Scanner;
public class Armstrong10 {
    public static void  checkArmstrongNum(int n){
        int tmp;
        double ld=0,total=0,digit=0;
        tmp=n;
        //for loop to check armstrong number
        for(;tmp>0;digit++){
            tmp=tmp/10;

        }
        for(tmp=n;tmp>0;) {
           ld=tmp%10;
           total = total + (Math.pow(ld, digit));
           tmp=tmp/10;
        }
        if(n==total)
            System.out.println("Entered number "+n+" is armstrong number");
        else
            System.out.println("Entered number "+n+" is not armstrong number");
    }

    public static void main(String[] args) //main method
    {
        //making object to get number from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check its armstrong number or not");
        int n=sc.nextInt();
        checkArmstrongNum(n);//calling static method directly
    }
}
