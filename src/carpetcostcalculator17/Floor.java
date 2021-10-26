/*
 public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("Circle.radius= " + circle.getRadius());
        System.out.println("Circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius= " + cylinder.getRadius());
        System.out.println("Cylinder.height " + cylinder.getHeight());
        System.out.println("Cylinder.area= " + cylinder.getArea());
        System.out.println("Cylinder.volume= " + cylinder.getVolume());
 */
package carpetcostcalculator17;
public class Floor {
    double width,length;//instance variable
    Floor(double width,double length)//parameterised constructor
    {
        this.width=width;
        this.length=length;
        if(width<0){
            this.width=0;
        }else if(length<0){
            this.length=0;
        }

    }
    public double getArea()//instance method
    {
        return width*length;
    }


}
