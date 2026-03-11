package Day11;

import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<Product> sortByPrice(List<Product> products){
        List<Product> priceSortList = products.stream().sorted().collect(Collectors.toUnmodifiableList());
        return priceSortList;
    }
}
