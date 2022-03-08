package com.il;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.il.RomanNumbers.ILLEAGAL_EXCEPTION_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumbersTest {

    private RomanNumbers romanNumbers;

    @BeforeEach
    void setup() {
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

    @ParameterizedTest
    @CsvSource({"1, I", "2, II", "3, III", "4,IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX", "14, XIV", "19, XIX", "20, XX",
            "50, L", "60, LX", "90,  XC", "100, C", "110, CX", "300, CCC", "400, CD", "500, D", "600, DC", "900, CM", "1000, M", "1100, MC",
            "1400, MCD", "1500, MD", "1600, MDC", "1900, MCM", "3000, MMM",})
    void toRomanNumber_shouldReturnI_whenNumber1Passed(int num, String romanNum) {
        // given

        // when
        String actual = romanNumbers.toRomanNumber(num);

        // then
        assertEquals(romanNum, actual, "Message should be equal.");
    }
}