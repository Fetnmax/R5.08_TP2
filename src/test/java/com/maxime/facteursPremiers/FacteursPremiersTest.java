package com.maxime.facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {

    @Test
    void genrate_devrait_retourner_une_liste_vide_quand_un_est_passe_en_parametre() {
        List<Integer> result = FacteursPremiers.generate(1);
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void generate_devrait_retourner_une_erreur_quand_un_nombre_negatif_est_passe_en_parametre() {
        try {
            FacteursPremiers.generate(-1);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Nombre négatif non supporté");
        }
    }

    @Test
    void generate_devrait_retourner_une_erreur_quand_zero_est_passe_en_parametre() {
        try {
            FacteursPremiers.generate(0);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Zéro non supporté");
        }
    }
}