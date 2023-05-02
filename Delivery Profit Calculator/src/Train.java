public class Train extends Transport {
    private double transportCosts;

    public Train(double distance, double payment) {
        super(distance, payment);
        this.transportCosts = 0.05 * distance;
    }

    @Override
    public double profitCalc() {
        double fullProfit = super.payment - transportCosts;
        return fullProfit;
    }
}
