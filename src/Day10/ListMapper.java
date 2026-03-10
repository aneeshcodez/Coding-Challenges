package Day10;

import java.util.List;
import java.util.stream.Collectors;

public class ListMapper {

    public static List<ProductDto> toDto(List<Product> products){
        List<ProductDto> productDtoList = products.stream()
                .filter(product -> product.getPrice() > 1000)
                .map(product -> new ProductDto(product.getName(),product.getPrice()))
                .collect(Collectors.toUnmodifiableList());
        return productDtoList;
    }
}
