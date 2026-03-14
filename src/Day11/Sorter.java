package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sortByName(List<Product> products){
        List<String> listOfNames = new ArrayList<>();
        for(Product product : products){
            String name = product.getName();
            listOfNames.add(name);
        }
        List<String> priceSortedList = listOfNames.stream().sorted().collect(Collectors.toUnmodifiableList());
        return priceSortedList;
    }
}

// Aready started Day 11
// I was trying to accomplish 1st task of Day 11 by following Alexander Obregon in Medium
// Pls finish this task and all other task in that Day

// Try to use .map() instead of looping so first learn it
// Update in Notion

// The Java Stream map() method is used to return a new stream of objects
//