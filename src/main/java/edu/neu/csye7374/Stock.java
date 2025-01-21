package edu.neu.csye7374;

public abstract class Stock implements Tradable {
    private String id;
    private double price;
    private String description;

    public Stock(String id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    // Abstract methods for subclasses
    public abstract void setBid(String bid);
    public abstract int getMetric();
}
