/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciSeries9 {
    public static void fibonacciSeries() {
        int a = 1, b = 1, c, n = 8;
        System.out.print(a+" "+b);
        //logic to get fibonacci numbers
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        fibonacciSeries();//calling static method directly

    }
}
