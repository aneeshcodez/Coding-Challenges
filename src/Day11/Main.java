package Day11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "iPhone", "Electronics", 90000),
                new Product(2L, "Laptop", "Electronics", 70000),
                new Product(3L, "Keyboard", "Electronics", 1500),
                new Product(4L, "Shoes", "Fashion", 3000),
                new Product(5L, "T-Shirt", "Fashion", 800),
                new Product(6L, "Rice Bag", "Grocery", 1200)
        );

        List<String> sortedList = Sorter.sortByName(products);
        for(String name : sortedList){
            System.out.println(name);
        }

        List<Product> products1 = Sorter.sortByPrice(products);
        for(Product p : products1){
            System.out.println(p.getPrice());
        }

    }
}
