public class Laptop {

    String shape;
    String color;
    long fixedCost;
    long VariableCost;
    public static long Cost(long fixedCost, long VariableCost){

        long TotalCost = fixedCost + VariableCost;
        return TotalCost;


    }

    public static void main(String[] args) {

        Laptop Apple = new Laptop();
        Apple.shape = "Round";
        Apple.fixedCost = 100;
        Apple.VariableCost = 300;
        Laptop.Cost(Apple.fixedCost, Apple.VariableCost);
        System.out.println(Laptop.Cost(Apple.fixedCost, Apple.VariableCost));



    }


}



