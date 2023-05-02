import java.util.Scanner;

interface Profit {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a distance in km: ");
        double x = scanner.nextDouble();
        System.out.println("Give a payment amount in PLN: ");
        double y = scanner.nextDouble();
        Train train = new Train(x, y);
        Plane plane = new Plane(x, y);
        double trainProfit = train.profitCalc();
        double planeProfit = plane.profitCalc();
        outputResults(trainProfit, planeProfit);
    }

    public static void outputResults(double trainProfit, double planeProfit) {
        System.out.println("Delivery profit using train: " + trainProfit + " PLN");
        System.out.println("Delivery profit using plane: " + planeProfit + " PLN");
        double difference = trainProfit - planeProfit;
        if (difference < 0) {
            System.out.println("Delivery profit using train are " + Math.abs(difference) + " PLN less then using a plane ");
        } else if (difference > 0) {
            System.out.println("Delivery profit using plane are " + difference + " PLN less then using a train");
        } else {
            System.out.println("Delivery profit are same both for using a train and a plane");
        }
    }
}