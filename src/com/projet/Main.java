package com.projet;

import com.projet.temperature.Temperature;
import com.projet.monnaie.Monnaie;
import com.projet.masse.Masse;
import com.projet.distance.Distance; // Importer la classe Distance
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Afficher le menu de conversion
            System.out.println("Sélectionnez l'option de conversion:");
            System.out.println("1. Convertir la température");
            System.out.println("2. Convertir la distance");
            System.out.println("3. Convertir la masse");
            System.out.println("4. Convertir la monnaie");
            System.out.println("5. Afficher l'historique des conversions");
            System.out.println("6. Quitter");
            System.out.print("Votre choix: ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Conversion de la température
                    System.out.println("Sélectionnez le type de conversion:");
                    System.out.println("1. Celsius -> Fahrenheit");
                    System.out.println("2. Fahrenheit -> Celsius");
                    System.out.print("Votre choix: ");
                    int tempChoix = scanner.nextInt();

                    if (tempChoix == 1) {
                        System.out.print("Entrez la température en °C: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = Temperature.celsiusToFahrenheit(celsius);
                        System.out.println(celsius + "°C = " + fahrenheit + "°F");
                        // Enregistrer dans l'historique
                        Historique
                                .ajouterHistorique("Température convertie: " + celsius + "°C -> " + fahrenheit + "°F");
                    } else if (tempChoix == 2) {
                        System.out.print("Entrez la température en °F: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = Temperature.fahrenheitToCelsius(fahrenheit);
                        System.out.println(fahrenheit + "°F = " + celsius + "°C");
                        // Enregistrer dans l'historique
                        Historique
                                .ajouterHistorique("Température convertie: " + fahrenheit + "°F -> " + celsius + "°C");
                    } else {
                        System.out.println("Choix invalide.");
                    }
                    break;

                case 2:
                    // Conversion de la distance
                    System.out.println("Sélectionnez le type de conversion:");
                    System.out.println("1. Kilomètres -> Miles");
                    System.out.println("2. Miles -> Kilomètres");
                    System.out.print("Votre choix: ");
                    int distChoix = scanner.nextInt();

                    if (distChoix == 1) {
                        System.out.print("Entrez la distance en kilomètres: ");
                        double km = scanner.nextDouble();
                        double miles = Distance.kilometersToMiles(km);
                        System.out.println(km + " kilomètres = " + miles + " miles");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Distance convertie: " + km + " km -> " + miles + " miles");
                    } else if (distChoix == 2) {
                        System.out.print("Entrez la distance en miles: ");
                        double miles = scanner.nextDouble();
                        double km = Distance.milesToKilometers(miles);
                        System.out.println(miles + " miles = " + km + " kilomètres");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Distance convertie: " + miles + " miles -> " + km + " km");
                    } else {
                        System.out.println("Choix invalide.");
                    }
                    break;

                case 3:
                    // Conversion de la masse
                    System.out.println("Sélectionnez le type de conversion:");
                    System.out.println("1. Kilogrammes -> Livres");
                    System.out.println("2. Livres -> Kilogrammes");
                    System.out.print("Votre choix: ");
                    int masseChoix = scanner.nextInt();

                    if (masseChoix == 1) {
                        System.out.print("Entrez la masse en kilogrammes: ");
                        double kilogrammes = scanner.nextDouble();
                        double livres = Masse.kilogrammesToLivres(kilogrammes);
                        System.out.println(kilogrammes + " kg = " + livres + " lb");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Masse convertie: " + kilogrammes + " kg -> " + livres + " lb");
                    } else if (masseChoix == 2) {
                        System.out.print("Entrez la masse en livres: ");
                        double livres = scanner.nextDouble();
                        double kilogrammes = Masse.livresToKilogrammes(livres);
                        System.out.println(livres + " lb = " + kilogrammes + " kg");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Masse convertie: " + livres + " lb -> " + kilogrammes + " kg");
                    } else {
                        System.out.println("Choix invalide.");
                    }
                    break;

                case 4:
                    // Conversion de la monnaie
                    System.out.println("Sélectionnez le type de conversion:");
                    System.out.println("1. EUR -> USD");
                    System.out.println("2. USD -> EUR");
                    System.out.print("Votre choix: ");
                    int monnaieChoix = scanner.nextInt();

                    if (monnaieChoix == 1) {
                        System.out.print("Entrez la somme en EUR: ");
                        double euros = scanner.nextDouble();
                        double usd = Monnaie.eurToUsd(euros);
                        System.out.println(euros + " EUR = " + usd + " USD");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Monnaie convertie: " + euros + " EUR -> " + usd + " USD");
                    } else if (monnaieChoix == 2) {
                        System.out.print("Entrez la somme en USD: ");
                        double usd = scanner.nextDouble();
                        double euros = Monnaie.usdToEur(usd);
                        System.out.println(usd + " USD = " + euros + " EUR");
                        // Enregistrer dans l'historique
                        Historique.ajouterHistorique("Monnaie convertie: " + usd + " USD -> " + euros + " EUR");
                    } else {
                        System.out.println("Choix invalide.");
                    }
                    break;

                case 5:
                    // Afficher l'historique des conversions
                    Historique.afficherHistorique();
                    break;

                case 6:
                    // Quitter
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
