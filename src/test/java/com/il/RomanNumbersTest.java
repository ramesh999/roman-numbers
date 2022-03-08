package com.il;

import org.junit.jupiter.api.Test;

import static com.il.RomanNumbers.ILLEAGAL_EXCEPTION_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals(ILLEAGAL_EXCEPTION_MESSAGE, actual.getMessage(), "Message should be equal.");
    }

    @Test
    void toRomanNumber_shouldThrowInvalidArgumentException_whenZeroPassed() {
        // given
        RomanNumbers romanNumbers = new RomanNumbers();
        // when
        IllegalArgumentException actual =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> romanNumbers.toRomanNumber(0),
                        "Should throw exception");

        // then
        assertEquals(ILLEAGAL_EXCEPTION_MESSAGE, actual.getMessage(), "Message should be equal.");
    }

    @Test
    void toRomanNumber_shouldThrowInvalidArgumentException_whenNumberGreaterThan3000Passed() {
        // given
        RomanNumbers romanNumbers = new RomanNumbers();
        // when
        IllegalArgumentException actual =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> romanNumbers.toRomanNumber(3001),
                        "Should throw exception");

        // then
        assertEquals(ILLEAGAL_EXCEPTION_MESSAGE, actual.getMessage(), "Message should be equal.");
    }

}