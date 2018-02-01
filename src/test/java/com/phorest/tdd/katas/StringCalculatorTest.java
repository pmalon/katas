package com.phorest.tdd.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void shouldReturnZeroForAnEmptyString() {
        // given:
        String numbers = "";

        // when:
        int result = stringCalculator.add(numbers);

        // then:
        assertThat(result, is(0));
    }

    @Test
    public void shouldHandleSingleDigitNumbers() {
        // given:
        String numbers = "5";

        // when:
        int result = stringCalculator.add(numbers);

        // then:
        assertThat(result, is(5));
    }

    @Test
    public void shouldSumTwoNumbers() {
        // given:
        String numbers = "5,7";

        // when:
        int result = stringCalculator.add(numbers);

        // then:
        assertThat(result, is(12));
    }
}