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
}