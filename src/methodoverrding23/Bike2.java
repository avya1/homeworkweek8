package methodoverrding23;
//Child class Bike2 extends parent class Vehicle
public class Bike2 {
    public void run()//defining same method as in parent class
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();//creating object
        obj.run();//calling method
    }
}
