package Day11;

import Day10.ListMapper;
import Day10.Product;
import Day10.ProductDto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Day10.Product> products = List.of(
                new Day10.Product(1L, "iPhone", "Electronics", 90000),
                new Day10.Product(2L, "Laptop", "Electronics", 70000),
                new Day10.Product(3L, "Keyboard", "Electronics", 1500),
                new Day10.Product(4L, "Shoes", "Fashion", 3000),
                new Day10.Product(5L, "T-Shirt", "Fashion", 800),
                new Product(6L, "Rice Bag", "Grocery", 1200)
        );

        List<Day10.ProductDto> resultDtoList = ListMapper.toDto(products);
        System.out.println(resultDtoList);
        for(ProductDto productDto : resultDtoList){
            System.out.println(productDto.getName());
            System.out.print(productDto.getPrice());
        }

    }
}
