package day3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_Practice {
    public static void main(String[] args) {
        List<String> strings = List.of("car","bike","aeroplane");
        List<String> stream = strings.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(stream);

    }




}

// Explaination of import java.util.List;
// sout doesnt work in a class without psvm
