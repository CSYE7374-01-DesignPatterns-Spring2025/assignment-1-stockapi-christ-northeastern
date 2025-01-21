package edu.neu.csye7374.stockApi;
/**
 *
 * @author christrodrigues
 */
public class Amazon extends Stock {

    private int metric;

    public Amazon(String id, double price, String description) {
        super(id, price, description);
        this.metric = 1500;  // Initial metric value
    }

    @Override
    public void setBid(double bid) {
        setPrice(bid);  // Simulate changing the stock price based on the bid
        System.out.println("Amazon bid set to: " + bid);
        metric -= 5;  // Decrease the metric based on the bid 
    }

    @Override
    public int getMetric() {
        return metric;
    }
}
