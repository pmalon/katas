package com.phorest.tdd.katas;

public class StringCalculator {

    public int add(String numbersString) {
        if (numbersString.isEmpty()) {
            return 0;
        }

        String[] numbers = numbersString.split(",");

        if (numbers.length == 1) {
            return Integer.parseInt(numbers[0]);
        }

        throw new UnsupportedOperationException("not implemented yet");
    }

}
