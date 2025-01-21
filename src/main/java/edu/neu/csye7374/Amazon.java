package edu.neu.csye7374;

public class Amazon extends Stock {

    private static Amazon instance;

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
        setPrice(bidValue);
    }

    @Override
    public int getMetric() {
        return (int) getPrice() + 10;
    }
}
