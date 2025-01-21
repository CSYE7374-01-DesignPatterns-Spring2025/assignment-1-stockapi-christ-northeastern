package edu.neu.csye7374;

import edu.neu.csye7374.stockApi.StockMarket;

/**
 *
 * @author Yesha
 *
 */

public class Driver {

    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //Add your code in between these two print statements
        StockMarket stockMarket = StockMarket.getInstance();
        stockMarket.demo();

        System.out.println("\n\n============Main Execution End===================");
    }

}
