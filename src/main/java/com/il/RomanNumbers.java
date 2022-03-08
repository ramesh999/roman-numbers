package com.il;

public class RomanNumbers {

    public static final String ILLEAGAL_EXCEPTION_MESSAGE =
            "Number should be greater than zero and less than or equal to 3000";

    public String toRomanNumber(int num) {
        if (num <= 0 || num > 3000) {
            throw new IllegalArgumentException(ILLEAGAL_EXCEPTION_MESSAGE);
        }
        return "I";
    }
}
