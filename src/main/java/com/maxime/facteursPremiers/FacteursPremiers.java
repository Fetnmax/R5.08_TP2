package com.maxime.facteursPremiers;

import java.util.Collections;
import java.util.List;

public class FacteursPremiers {

    public static List<Integer> generate(int number) {
        if (number == 1) {
            return Collections.emptyList();
        }
        if (number < 0) {
            throw new IllegalArgumentException("Nombre négatif non supporté");
        }
        return null;
    }
}