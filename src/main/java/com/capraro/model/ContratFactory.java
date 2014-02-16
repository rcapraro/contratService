package com.capraro.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by rcapraro on 16/02/2014.
 */
public class ContratFactory {

    public static List<Contrat> createContrats() {

        final Contrat contrat1 = new Contrat(1L, "1A0001", "AUTO", new Date(), "EN_COURS");

        final Contrat contrat2 = new Contrat(2L, "1H0002", "IMMO", new Date(), "EN_COURS");


        return Arrays.asList(new Contrat[] {contrat1, contrat2});

    }
}
