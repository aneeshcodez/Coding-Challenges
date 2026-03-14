package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sortByName(List<Product> products){
        List<String> nameSortedList = products.stream().map(Product::getName)
                                      .sorted().toList();


        return nameSortedList;
    }
}


// The Java Stream map() method is used to return a new stream of objects
// .map(product -> product.getName()) = .map(Product::getName)

// Learn 3 in blue book
// 3-4 challenges
// prod code