package com.il;

import java.util.TreeMap;

import static java.util.Objects.nonNull;

public class RomanNumbers {

    public static final String ILLEAGAL_EXCEPTION_MESSAGE =
            "Number should be greater than zero and less than or equal to 3000";
    private final TreeMap<Integer, String> map;

    public RomanNumbers() {
        map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public String toRomanNumber(int num) {

        if (num <= 0 || num > 3000) {
            throw new IllegalArgumentException(ILLEAGAL_EXCEPTION_MESSAGE);
        }

        int temp = num;
        Integer key = map.floorKey(num);
        String value = "";
        while (nonNull(key)) {
            value += map.get(key);
            temp = temp - key;
            key = map.floorKey(temp);
        }
        return value;
    }
}
