package poolarea20;

public class Cuboid extends Rectangle {
    double height;//instance variable
    Cuboid(double width, double lenght, double height)// parameterised constructor
    {
        super(width,lenght);
        if(height<0)
                this.height=0;
        this.height=height;
    }
    public double getHeight()//instance method
    {
        return height;
    }
    public double getVolume()//instance method
    {
        return getArea()*height;
    }

}
