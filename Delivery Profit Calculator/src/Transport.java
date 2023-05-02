public abstract class Transport {
    private double distance;
    protected double payment;

    public Transport(double distance, double payment) {
        this.distance = distance;
        this.payment = payment;
    }

    public abstract double profitCalc();
}
