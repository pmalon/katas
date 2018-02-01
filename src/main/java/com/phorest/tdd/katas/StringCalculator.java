package com.phorest.tdd.katas;

public class StringCalculator {

    public int add(String numbersString) {
        if (numbersString.isEmpty()) {
            return 0;
        }

        String[] numbers = getNumbers(numbersString);

        if (numbers.length == 1) {
            return getFirstNumber(numbers);
        }

        if (numbers.length == 2) {
            int firstNumber = getFirstNumber(numbers);
            int secondNumber = getNumberAtIndex(numbers, 1);
            return firstNumber + secondNumber;
        }

        throw new UnsupportedOperationException("not implemented yet");
    }

    private int getFirstNumber(String[] numbers) {
        return getNumberAtIndex(numbers, 0);
    }

    private String[] getNumbers(String numbersString) {
        return numbersString.split(",");
    }

    private int getNumberAtIndex(String[] numbers, int idx) {
        return numbers.length > idx ?  Integer.parseInt(numbers[idx]) : 0;
    }

}
