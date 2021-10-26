package carpetcostcalculator17;

public class Carpet {
    double cost;//instance variable
    Carpet(double cost)//parameterised constructor
    {
        this.cost=cost;
        if(cost<0)
            this.cost=0;
    }
    public double getCost()//instance method
    {
        return cost;
    }
}
