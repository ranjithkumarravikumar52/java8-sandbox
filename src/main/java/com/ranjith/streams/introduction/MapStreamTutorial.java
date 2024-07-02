package com.ranjith.streams.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamTutorial {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Transforms each element in the stream
        List<Integer> squaredIntegers = numbers.stream()
                .map(number -> (number * number))
                .collect(Collectors.toList());

        System.out.println(squaredIntegers);

    }

}
