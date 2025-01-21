package edu.neu.csye7374;

public class Tesla extends Stock {

    private static Tesla instance;

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
        setPrice(bidValue);
    }

    @Override
    public int getMetric() {
        return (int) getPrice() + 5;
    }
}
