package Tests;

import bases.Personnage;
import personnages.*;
import utilitaires.TypeElementaire;

public class TestPersonnage {
    public static void main(String[] args) {
        // Combattant
        Combattant monCombattant = new Combattant("LaBrute", "Ancienne", 100, 15, 20, 10);
        System.out.println("[Combattant] - " + monCombattant.toString());
        monCombattant.narguer();
        monCombattant.fuir();
        // Fin

        System.out.println(" - ");

        // Barbare
        Barbare monBarbare = new Barbare("LeFou", "Jean", 80, 20, 12, 7);
        System.out.println("[Barbare] - " + monBarbare.toString());
        monBarbare.narguer();
        monBarbare.fuir();
        // Fin

        System.out.println(" - ");

        // Magicien
        Magicien monMagicien = new Magicien("LeMysterieux", "Magelan", 60, 7, 30, 5, TypeElementaire.FEU);
        System.out.println("[Magicien] - " + monMagicien.toString());
        monMagicien.narguer();
        monMagicien.fuir();
        // Fin

        System.out.println(" - ");

        // Amazone
        Amazone monAmazone = new Amazone("Amazonie", "DeAmazon", 100, 8, 11, 9);
        System.out.println("[Amazone] - " + monAmazone.toString());
        monAmazone.narguer();
        monAmazone.fuir();
        // Fin

        System.out.println(" - ");

        // Mage
        Mage monMage = new Mage("LeLouche", "Magique", 40, 7, 15, 13, TypeElementaire.EAU);
        System.out.println("[Mage] - " + monMage.toString());
        monMage.narguer();
        monMage.lancerSortParticulier();
        monMage.fuir();
        // Fin

        System.out.println(" - ");

        // Paladin
        Paladin monPaladin = new Paladin("Din", "Pala", 80, 20, 6, 12);
        System.out.println("[Paladin] - " + monPaladin.toString());
        monPaladin.narguer();
        monPaladin.seSoigner();
        System.out.println(monPaladin.getPointsDeVie());
        monPaladin.fuir();
        // Fin

        System.out.println(" - ");

        // Pretre
        Pretre monPretre = new Pretre("Mono", "Tone", 40, 5, 40, 30, TypeElementaire.METAL);
        System.out.println("[Pretre] - " + monPretre.toString());
        monPretre.narguer();
        monPretre.seSoigner();
        System.out.println(monPretre.getPointsDeVie());
        monPretre.fuir();
        // Fin
    }
}