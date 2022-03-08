package com.il;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    void toRomanNumber_shouldThrowInvalidArgumentException_whenNegativeNumbersPassed() {
        // given
        RomanNumbers romanNumbers = new RomanNumbers();
        // when
        IllegalArgumentException actual =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> romanNumbers.toRomanNumber(-1),
                        "Should throw exception");

        // then
        assertEquals("Number should be greater than zero", actual.getMessage(), "Message should be equal.");
    }


}