package com.projet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Historique {

    private static final String HISTORIQUE_FILE = "historique.txt";

    // Méthode pour enregistrer une conversion dans l'historique
    public static void ajouterHistorique(String conversionDetails) {
        try {
            // Créer un fichier s'il n'existe pas
            File file = new File(HISTORIQUE_FILE);
            if (!file.exists()) {
                file.createNewFile();
            }

            // Utilisation de BufferedWriter pour écrire dans le fichier
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.append(conversionDetails + "\n"); // Ajouter la conversion avec un retour à la ligne
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de l'ajout à l'historique: " + e.getMessage());
        }
    }

    // Méthode pour afficher l'historique des conversions
    public static void afficherHistorique() {
        try {
            File file = new File(HISTORIQUE_FILE);
            if (file.exists()) {
                System.out.println("Historique des conversions:");
                java.nio.file.Files.lines(file.toPath()).forEach(System.out::println);
            } else {
                System.out.println("Aucune conversion enregistrée.");
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture de l'historique: " + e.getMessage());
        }
    }
}
