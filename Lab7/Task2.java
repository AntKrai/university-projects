interface Transport {
    double calculateCost(int distance);
}

class Plane implements Transport{
    @Override
    public double calculateCost(int distance){
        return distance*distance*0.01;
    }
}

class Train implements Transport{
    @Override
    public double calculateCost(int distance){
        return distance/20;
    }
}

class ProfitCalculator{
    private int distance;
    private double payment;
    private Transport transport;

    public ProfitCalculator(int distance, double payment, Transport transport){
        this.distance = distance;
        this.payment = payment;
        this.transport = transport;
    }

    public double calculateProfit() {
        double cost = transport.calculateCost(distance);
        return payment - cost;
    }
}

public class Task2{
    public static void main(String[] args){
        // 1. Train 200km, 10PLN payment
        ProfitCalculator pc1 = new ProfitCalculator(200, 10, new Train());
        System.out.printf("Profit (Train, 200km, 10PLN): %.2f%n", pc1.calculateProfit());

        //2. 2 Planes 
        ProfitCalculator jobA = new ProfitCalculator(50, 50, new Plane());
        ProfitCalculator jobB = new ProfitCalculator(30, 40, new Plane());
        System.out.printf("Profit (Plane, 50km, 50PLN): %.2f%n", jobA.calculateProfit());
        System.out.printf("Profit (Plane, 30km, 40PLN): %.2f%n", jobB.calculateProfit());

        // 3. Best transport for 350km with 40PLN payment
        ProfitCalculator jobTrain = new ProfitCalculator(350, 45, new Train());
        ProfitCalculator jobPlane = new ProfitCalculator(350, 45, new Plane());
        System.out.printf("Profit (Plane, 350km, 45PLN): %.2f%n", jobTrain.calculateProfit());
        System.out.printf("Profit (Plane, 350km, 45PLN): %.2f%n", jobPlane.calculateProfit());
    }
}