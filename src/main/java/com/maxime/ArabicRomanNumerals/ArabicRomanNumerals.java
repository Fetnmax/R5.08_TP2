package com.maxime.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public static String convert(int nombre) {
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L"};

        return tens[nombre / 10] + units[nombre % 10];
    }
}
