package edu.neu.csye7374.stockApi;

public class Tesla extends Stock {

    private int metric;

    public Tesla(String id, double price, String description) {
        super(id, price, description);
        this.metric = 500;  // Initial metric value
    }

    @Override
    public void setBid(double bid) {
        setPrice(bid);  // Simulate changing the stock price based on the bid
        System.out.println("Tesla bid set to: " + bid);
        metric += 10;  // Increase the metric based on the bid (Example algorithm)
    }

    @Override
    public int getMetric() {
        return metric;
    }
}
