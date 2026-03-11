package Day11;

import java.util.List;

public class Product {

    Long id;
    String name;
    String category;
    double price;

    public Product(Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "iPhone", "Electronics", 90000),
                new Product(2L, "Laptop", "Electronics", 70000),
                new Product(3L, "Keyboard", "Electronics", 1500),
                new Product(4L, "Shoes", "Fashion", 3000),
                new Product(5L, "T-Shirt", "Fashion", 800),
                new Product(6L, "Rice Bag", "Grocery", 1200)
        );
    }
}
