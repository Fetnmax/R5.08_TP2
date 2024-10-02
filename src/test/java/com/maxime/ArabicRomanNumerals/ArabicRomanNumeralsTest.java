package com.maxime.ArabicRomanNumerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralsTest {

    @Test
    void convert_devrait_retourner_I_quand_1_est_passe_en_parametre() {
        // Given
        int nombre = 1;

        // When
        String result = ArabicRomanNumerals.convert(nombre);

        // Then
        assertThat(result).isEqualTo("I");
    }

    @Test
    void convert_devrait_renvoyer_XXXIV_quand_34_est_passe_en_parametre() {
        // Given
        int nombre = 34;

        // When
        String result = ArabicRomanNumerals.convert(nombre);

        // Then
        assertThat(result).isEqualTo("XXXIV");
    }

    @Test
    void convert_devrait_renvoyer_une_erreur_quand_un_nombre_inferieur_a_1_est_passe_en_parametre() {
        // Given
        int nombre = -1;

        // When
        try {
            ArabicRomanNumerals.convert(nombre);
        } catch (IllegalArgumentException e) {
            // Then
            assertThat(e.getMessage()).isEqualTo("Nombre compris entre 1 et 50 uniquement");
        }
    }

    @Test
    void convert_devrait_renvoyer_une_erreur_quand_un_nombre_superieur_a_50_est_passe_en_parametre() {
        // Given
        int nombre = 51;

        // When
        try {
            ArabicRomanNumerals.convert(nombre);
        } catch (IllegalArgumentException e) {
            // Then
            assertThat(e.getMessage()).isEqualTo("Nombre compris entre 1 et 50 uniquement");
        }
    }

}
