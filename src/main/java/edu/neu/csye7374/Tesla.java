package edu.neu.csye7374;
/**
 *
 * @author christrodrigues
 */
public class Tesla extends Stock {

    private static Tesla instance;
    private static final int BASE_METRIC = 500;  // Initial metric value

    private Tesla() {
        super("TSLA", 800.0, "Tesla Inc. Common Stock");
    }

    public static Tesla getInstance() {
        if (instance == null) {
            synchronized (Tesla.class) {
                if (instance == null) {
                    instance = new Tesla();
                }
            }
        }
        return instance;
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(bidValue);  // Update the stock price with the bid
    }

    @Override
    public int getMetric() {
        // Metric based on a 5% increase for each bid increment from the base metric
        return BASE_METRIC + (int) (getPrice() * 0.05);
    }
}
