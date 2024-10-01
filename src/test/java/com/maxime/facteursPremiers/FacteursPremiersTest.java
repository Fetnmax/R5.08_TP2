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

    @Test
    void generate_devrait_retourner_une_liste_contenant_2_quand_2_est_passe_en_parametre() {
        List<Integer> result = FacteursPremiers.generate(2);
        assertThat(result).containsExactly(2);
    }

    @Test
    void generate_devrait_retourner_une_liste_contenant_2_et_3_quand_6_est_passe_en_parametre() {
        List<Integer> result = FacteursPremiers.generate(6);
        assertThat(result).containsExactly(2, 3);
    }

    @Test
    void generate_devrait_retourner_une_liste_contenant_2_et_2_et_2_quand_8_est_passe_en_parametre() {
        List<Integer> result = FacteursPremiers.generate(8);
        assertThat(result).containsExactly(2, 2, 2);
    }
}