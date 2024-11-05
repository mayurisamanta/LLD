public class Product {

    private String name;
    private double price;

    // Prematurely added methods
    public void convertPriceToDifferentCurrency(String currency) {
        // Code to convert price
    }

    public String toJson() {
        return "{ \"name\": \"" + name + "\", \"price\": " + price + " }";
    }

    // Constructor, getters, and setters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Here convertPriceToDifferentCurrency() and toJson() are added prematurely
    // These methods are not needed now, so they violate the YAGNI principle
    // The YAGNI principle states that you should not add functionality until it is needed
    // So, these methods should be removed until they are actually needed
}
