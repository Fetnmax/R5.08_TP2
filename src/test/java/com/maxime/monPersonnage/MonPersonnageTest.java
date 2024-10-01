package com.maxime.monPersonnage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MonPersonnageTest {

    private MonPersonnage monPersonnage;

    @BeforeEach
    void setUp() {
        monPersonnage = new MonPersonnage();
    }

    @AfterEach
    void tearDown() {
        monPersonnage = null;
    }

    @Test
    void tourner_devrait_retourner_EST_quand_1_est_passe_en_parametre() {
        // Given
        int fois = 1;

        // When
        Direction result = monPersonnage.tourner(fois);

        // Then
        assertThat(result).isEqualTo(Direction.EST);
    }

    @Test
    void tourner_devrait_retourner_NULL_quand_0_est_passe_en_parametre() {
        // Given
        int fois = 0;

        // When
        Direction result = monPersonnage.tourner(fois);

        // Then
        assertThat(result).isNull();
    }

    @Test
    void tourner_devrait_retourner_OUEST_quand_3_est_passe_en_parametre() {
        // Given
        int fois = 3;

        // When
        Direction result = monPersonnage.tourner(fois);

        // Then
        assertThat(result).isEqualTo(Direction.OUEST);
    }

    @Test
    void tourner_devrait_retourner_une_erreur_quand_un_nombre_negatif_est_passe_en_parametre() {
        // Given
        int fois = -1;

        // When
        try {
            monPersonnage.tourner(fois);
        } catch (IllegalArgumentException e) {
            // Then
            assertThat(e.getMessage()).isEqualTo("Le nombre de fois doit être positif");
        }
    }
}
