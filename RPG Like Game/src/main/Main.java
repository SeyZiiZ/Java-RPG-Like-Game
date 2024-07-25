package main;

import bases.Personnage;
import equipements.Arme;
import monstres.*;
import personnages.*;
import utilitaires.TypeElementaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {

            List<Personnage> personnages = Config.creerPersonnages();
            List<Monstre> monstres = Config.creerMonstres();
            List<Arme> armes = Config.creerArmes();

            // SELECTION DES ARMES
            System.out.println("Choisissez votre arme:");
            for (int i = 0; i < armes.size(); i++) {
                Arme arme = armes.get(i);
                System.out.println((i + 1) + ": " + arme.getNomArme() +
                        " - Dégâts: " + arme.getDegatsArme() +
                        ", Type Élémentaire: " + arme.getTypeElementaireArme() +
                        ", Chance de Coup Critique: " + (arme.getCoupCritiqueArme() * 100) + "%");
            }
            int choixArme = scanner.nextInt() - 1;
            scanner.nextLine();
            Arme armeChoisie = armes.get(choixArme);

            // SELECTION DE PERSONNAGES
            System.out.println("Choisissez votre personnage:");
            for (int i = 0; i < personnages.size(); i++) {
                Personnage personnage = personnages.get(i);
                String nomComplet = personnage.getNom() + " " + personnage.getPrenom() + " (" + personnage.getPointsDeVie() + " PV)" + " (" + personnage.getAttaque() + " Points d'attaque)" + " [" + personnage.getTypePersonnage() + "]";
                System.out.println((i + 1) + ": " + nomComplet);
            }
            int choixPersonnage = scanner.nextInt() - 1;
            scanner.nextLine();
            Personnage personnageChoisi = personnages.get(choixPersonnage);
            personnageChoisi.setArme(armeChoisie);

            // SELECTION DES MONSTRES A COMBATTRE
            System.out.println("Choisissez le monstre à combattre:");
            for (int i = 0; i < monstres.size(); i++) {
                Monstre monstre = monstres.get(i);
                String nomComplet = monstre.getNom() + " " + monstre.getPrenom() + " [" + monstre.getTypeMonstre() + "]";
                System.out.println((i + 1) + ": " + nomComplet);
            }
            int choixMonstre = scanner.nextInt() - 1;
            scanner.nextLine();
            Monstre monstreChoisi = monstres.get(choixMonstre);

            combat(personnageChoisi, monstreChoisi, scanner);

            // REJOUER ?
            System.out.println("Voulez-vous rejouer ? (Oui pour continuer / Appuyer sur n'importe quel touche (Lettre ou Chiffre) et entrer pour quitter)");
            String reponse = scanner.next();
            continuer = reponse.equalsIgnoreCase("oui");
        }

        System.out.println("Merci d'avoir joué !");
    }
    public static void combat(Personnage personnage, Monstre monstre, Scanner scanner) {
        System.out.println(personnage.getNom() + " " + personnage.getPrenom() + " [" + personnage.getTypePersonnage() + "]," + " commence un combat contre " + monstre.getNom() + " " + monstre.getPrenom() + " [" + monstre.getTypeMonstre() + "]");

        while (personnage.getPointsDeVie() > 0 && monstre.getPointsDeVie() > 0) {
            monstre.attaquer(personnage);
            if (personnage.getPointsDeVie() <= 30 && personnage.getPointsDeVie() > 0) {
                System.out.println("ATTENTION: Vos points de vie sont très bas, (" + personnage.getPointsDeVie() + " points de vie). Voulez-vous fuir (Taper Fuir) ou continuer à combattre (Continuer Combattre) ?");
                String decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("Fuir")) {
                    personnage.fuir();
                    System.out.println("Vous avez choisi de fuir. Fin du combat.");
                    return;  // Quitter la méthode combat si le joueur décide de fuir
                }
            }
            if (personnage.getPointsDeVie() > 0) {
                personnage.attaquer(monstre);
            }
        }

        if (personnage.getPointsDeVie() <= 0) {
            System.out.println(personnage.getNom() + " " + personnage.getPrenom() + " a été vaincu par " + monstre.getNom() + " " + monstre.getPrenom() + ".");
        } else if (monstre.getPointsDeVie() <= 0) {
            System.out.println(monstre.getNom() + " " + monstre.getPrenom() + " a été vaincu par " + personnage.getNom() + " " + personnage.getPrenom() + ".");
        }
    }
}


