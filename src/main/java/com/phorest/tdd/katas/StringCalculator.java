package com.phorest.tdd.katas;

import java.util.stream.Stream;

public class StringCalculator {

    public int add(String numbersString) {
        return Stream.of(getNumbers(numbersString))
                .filter(this::isNumeric)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String[] getNumbers(String numbersString) {
        return numbersString.split(",");
    }

    private boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

}
