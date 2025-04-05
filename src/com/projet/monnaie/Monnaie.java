package com.projet.monnaie;

public class Monnaie {

    // Convertir EUR en USD
    public static double eurToUsd(double euros) {
        return euros * 1.09; // Taux de conversion (exemple)
    }

    // Convertir USD en EUR
    public static double usdToEur(double usd) {
        return usd / 1.09; // Taux de conversion (exemple)
    }
}
