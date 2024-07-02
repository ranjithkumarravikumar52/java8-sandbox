package com.ranjith.streams.introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseOne {
    public static void main(String[] args) {

        // 1. Filter a list of integers to only include even numbers.
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = list.stream()
                .filter(number -> (number % 2 == 0))
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        // 2. Convert a list of strings to uppercase.
        List<String> names = Arrays.asList("ana", "bob", "cathy", "derrick");

        List<String> uppperCaseNames = names.stream()
                .map(name -> (name.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(uppperCaseNames);

    }
}
