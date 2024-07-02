package com.ranjith.streams.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseTwo {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 40));

        // traditional for loop processing
        List<String> names = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 30) {
                names.add(person.getName());
            }
        }
        System.out.println(names); // Output: [Charlie, David]

        // Exercise - using streams-based processing
        List<String> result = people.stream()
                .filter(eachPeople -> (eachPeople.getAge() > 30))
                .map(eachPeople -> eachPeople.getName())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
