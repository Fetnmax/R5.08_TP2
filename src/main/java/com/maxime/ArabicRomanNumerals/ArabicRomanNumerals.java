package com.maxime.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public static String convert(int nombre) {
        if (nombre < 1 || nombre > 50) {
            throw new IllegalArgumentException("Nombre compris entre 1 et 50 uniquement");
        }
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L"};

        return tens[nombre / 10] + units[nombre % 10];
    }
}
