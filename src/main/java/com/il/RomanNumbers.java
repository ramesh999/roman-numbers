package com.il;

public class RomanNumbers {

    public static final String ILLEAGAL_EXCEPTION_MESSAGE =
            "Number should be greater than zero and less than or equal to 3000";

    public String toRomanNumber(int num) {
        if (num <= 0 || num > 3000) {
            throw new IllegalArgumentException(ILLEAGAL_EXCEPTION_MESSAGE);
        }

        int temp = num;
        String value = "";
        while (temp >= 1000){
            value += "M";
            temp = temp - 1000;
        }
        while (temp >= 900){
            value += "CM";
            temp = temp - 900;
        }
        while (temp >= 500){
            value += "D";
            temp = temp - 500;
        }
        while (temp >= 400){
            value += "CD";
            temp = temp - 400;
        }
        while (temp >= 100){
            value += "C";
            temp = temp - 100;
        }
        while (temp >= 90){
            value += "XC";
            temp = temp - 90;
        }
        while (temp >= 50){
            value += "L";
            temp = temp - 50;
        }
        while (temp >= 40){
            value += "XL";
            temp = temp - 40;
        }
        while (temp >= 10) {
            value += "X";
            temp = temp - 10;
        }
        while (temp >= 9) {
            value += "IX";
            temp = temp - 9;
        }
        while (temp >= 5) {
            value += "V";
            temp = temp - 5;
        }
        while (temp >= 4) {
            value += "IV";
            temp = temp - 4;
        }
        while (temp >= 1) {
            value += "I";
            temp = temp - 1;
        }
        return value;
    }
}
