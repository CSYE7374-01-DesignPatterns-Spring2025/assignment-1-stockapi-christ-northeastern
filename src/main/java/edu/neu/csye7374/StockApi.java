package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockAPI {

    private static StockAPI instance;

    private StockAPI() {}

    public static StockAPI getInstance() {
        if (instance == null) {
            synchronized (StockAPI.class) {
                if (instance == null) {
                    instance = new StockAPI();
                }
            }
        }
        return instance;
    }

    public void demo() {
        Stock tesla = Tesla.getInstance();
        Stock amazon = Amazon.getInstance();

        // Simulate 6 bids for Tesla and display each bid
        System.out.println("Tesla Stock:");
        System.out.println("Initial Metric: " + tesla.getMetric());
        for (int i = 0; i < 6; i++) {
            String bid = String.valueOf(tesla.getPrice() + 10);  // Simulate bid increment for Tesla
            tesla.setBid(bid);
            System.out.println("Tesla bid set to: " + bid);
        }
        System.out.println("Tesla Final Metric after 6 bids: " + tesla.getMetric());

        // Simulate 6 bids for Amazon and display each bid
        System.out.println("\nAmazon Stock:");
        System.out.println("Initial Metric: " + amazon.getMetric());
        for (int i = 0; i < 6; i++) {
            String bid = String.valueOf(amazon.getPrice() + 10);  // Simulate bid increment for Amazon
            amazon.setBid(bid);
            System.out.println("Amazon bid set to: " + bid);
        }
        System.out.println("Amazon Final Metric after 6 bids: " + amazon.getMetric());

        // Stock List
        List<Stock> stockList = new ArrayList<>();
        stockList.add(tesla);
        stockList.add(amazon);

        System.out.println("\nStock List:");
        for (Stock stock : stockList) {
            System.out.println(stock);
        }

        // Remove all stocks from list
        stockList.clear();
        System.out.println("\nStock List after Remove:");
        for (Stock stock : stockList) {
            System.out.println(stock);
        }
    }
}
