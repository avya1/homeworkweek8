/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Triangle8 {
    public static void rightAngleTriangle(){
        int n=5;
        //nested for loop to get given triangle pattern
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rightAngleTriangle();
    }
}
