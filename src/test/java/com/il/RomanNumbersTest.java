package com.il;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.il.RomanNumbers.ILLEAGAL_EXCEPTION_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumbersTest {

    private RomanNumbers romanNumbers;

    @BeforeEach
    void setup(){
        romanNumbers = new RomanNumbers();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 3001})
    void toRomanNumber_shouldThrowInvalidArgumentException_whenInvalidNumberPassed(int num) {
        // given

        // when
        IllegalArgumentException actual =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> romanNumbers.toRomanNumber(num),
                        "Should throw exception");

        // then
        assertEquals(ILLEAGAL_EXCEPTION_MESSAGE, actual.getMessage(), "Message should be equal.");
    }
}