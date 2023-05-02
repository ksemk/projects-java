public class Plane extends Transport {

    private double transportCosts;

    public Plane(double distance, double payment) {
        super(distance, payment);
        this.transportCosts = 0.01 * distance * distance;
    }

    @Override
    public double profitCalc() {
        double fullProfit = super.payment - transportCosts;
        return fullProfit;
    }
}
