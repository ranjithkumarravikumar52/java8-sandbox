package com.ranjith.streams.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamTutorial {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // filter: Filters elements based on a given predicate (a condition)
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList()); // reduction operation

        System.out.println(filteredNames);

    }

}
