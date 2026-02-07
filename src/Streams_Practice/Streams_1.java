package Streams_Practice;

import java.util.List;
import java.util.stream.Collectors;

public class Streams_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> evenSquares = numbers.stream().filter(n -> n % 2 ==0).collect(Collectors.toUnmodifiableList());
        for(int n : evenSquares){
            System.out.println(n);
        }
    }
}

//copy this in Notion Notes :
// filter takes a predicate in a lambda
// Also copy notes for Predicate from 'Understanding Predicate from Java' from Chrome GPT

