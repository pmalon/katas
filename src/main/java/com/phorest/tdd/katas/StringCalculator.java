package com.phorest.tdd.katas;

public class StringCalculator {

    public int add(String numbersString) {
        if (numbersString.isEmpty()) {
            return 0;
        }

        String[] numbers = getNumbers(numbersString);

        if (numbers.length == 1) {
            return Integer.parseInt(numbers[0]);
        }

        if (numbers.length == 2) {
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);
            return firstNumber + secondNumber;
        }

        throw new UnsupportedOperationException("not implemented yet");
    }

    private String[] getNumbers(String numbersString) {
        return numbersString.split(",");
    }

}
