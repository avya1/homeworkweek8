
package cylinder19;
public class Cylinder extends Circle {
    double height;//instance variable


    public Cylinder(double radius, double height)//child class parameterised constructor
    {
        super(radius);//parent class constructor
        if(height<0)
        {
            this.height=0;
        }else {

            this.height = height;
        }
    }


    public double getHeight()//instance method
    {
        return height;
    }

    public double getVolume() //instance method
    {
        return getArea() * height;
    }



    }


