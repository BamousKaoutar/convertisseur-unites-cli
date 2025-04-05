package com.tonnom.masse;

public class Masse {

    // Kilogrammes to Livres
    public static double kgToLb(double kg) {
        return kg * 2.20462; // 1 kg = 2.20462 livres
    }

    // Livres to Kilogrammes
    public static double lbToKg(double lb) {
        return lb / 2.20462; // 1 livre = 0.453592 kg
    }
}
