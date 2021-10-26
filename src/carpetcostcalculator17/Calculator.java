package carpetcostcalculator17;

public class Calculator {
    Floor floor;
    Carpet carpet;
    Calculator(Floor floor,Carpet carpet)//parameterised constructor
    {
        this.carpet=carpet;
        this.floor=floor;
    }
    public double getTotalCost()//instance method
    {
        double cost;
        cost= floor.width*floor.length*carpet.cost;

        return cost;
    }
}
