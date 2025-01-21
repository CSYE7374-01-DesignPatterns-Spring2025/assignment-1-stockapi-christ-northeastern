package edu.neu.csye7374.stockApi;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    // Singleton instance of StockMarket
    private static StockMarket instance;

    // Private constructor to prevent instantiation
    private StockMarket() {}

    // Public method to get the instance of StockMarket
    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    // Demo method that simulates bidding for stocks
    public void demo() {
        // Create stock objects for Tesla and Amazon
        Stock tesla = new Tesla("TSLA", 800.0, "Tesla Inc. Common Stock");
        Stock amazon = new Amazon("AMZN", 3000.0, "Amazon Inc. Common Stock");

        // Simulate 6 bids for Tesla
        System.out.println("Tesla Stock:");
        System.out.println("Initial Metric: " + tesla.getMetric());
        for (int i = 0; i < 6; i++) {
            double bid = tesla.getPrice() + 10;  // Simulate bid increment for Tesla
            tesla.setBid(bid);
        }
        System.out.println("Tesla Final Metric after 6 bids: " + tesla.getMetric());

        // Simulate 6 bids for Amazon
        System.out.println("\nAmazon Stock:");
        System.out.println("Initial Metric: " + amazon.getMetric());
        for (int i = 0; i < 6; i++) {
            double bid = amazon.getPrice() + 10;  // Simulate bid increment for Amazon
            amazon.setBid(bid);
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
