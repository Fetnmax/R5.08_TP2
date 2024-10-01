package com.maxime.facteursPremiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate(int number) {
        if (number == 1) {
            return Collections.emptyList();
        }
        else if (number < 0) {
            throw new IllegalArgumentException("Nombre négatif non supporté");
        }
        else if (number == 0) {
            throw new IllegalArgumentException("Zéro non supporté");
        }
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}