package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sortByName(List<Product> products){
        List<String> nameSortedList = products.stream().map(product -> product.getName())
                                      .sorted().toList();


        return nameSortedList;
    }
}

// Learn method references

// The Java Stream map() method is used to return a new stream of objects
// .map(product -> product.getName()) =