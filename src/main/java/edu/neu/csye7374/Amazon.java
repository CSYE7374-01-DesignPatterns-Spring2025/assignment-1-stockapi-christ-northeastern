package edu.neu.csye7374;

/**
 *
 * @author christrodrigues
 */

public class Amazon extends Stock {

    private static Amazon instance;
    private double cumulativeChange = 0.0;  // Track cumulative change in price

    private Amazon() {
        super("AMZN", 3000.0, "Amazon Inc. Common Stock");
    }

    public static Amazon getInstance() {
        if (instance == null) {
            synchronized (Amazon.class) {
                if (instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        cumulativeChange += bidValue - getPrice();  // Track cumulative difference
        setPrice(bidValue);  // Update the stock price with the bid
    }

    @Override
    public int getMetric() {
        // Metric based on the cumulative price change, scaled by a factor of 2
        return (int) (cumulativeChange * 2);
    }
}
