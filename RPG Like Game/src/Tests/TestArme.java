package Tests;

import equipements.Arme;
import utilitaires.TypeElementaire;

public class TestArme {
    public static void main(String[] args) {

        Arme epee = new Arme("Epée du destin", 75, TypeElementaire.FEU, 0.1);
        Arme javelot = new Arme("Javelot de la trinité", 55, TypeElementaire.BOIS, 0.05);
        Arme lance = new Arme("Lance du pouvoir", 55, TypeElementaire.METAL, 1);

        // Epée
        System.out.println("[Arme] - Nom: " + epee.getNomArme() +
                ", Degats de base: " + epee.getDegatsArme() +
                ", Coup critique, dégats infligés : " + epee.calculerDegats() +
                ", Type Elémentaire: " + epee.getTypeElementaireArme() +
                ", Chance de Coup Critique: " + epee.getCoupCritiqueArme() * 100 + "%");

        // Javelot
        System.out.println("[Arme] - Nom: " + javelot.getNomArme() +
                ", Dégats de base : " + javelot.getDegatsArme() +
                ", Coup critique, dégats infligés : " + javelot.calculerDegats() +
                ", Type élémentaire : " + javelot.getTypeElementaireArme() +
                ", Chance de coup critique : " + javelot.getCoupCritiqueArme() * 100 + "%");


        // Lance
        System.out.println("[Arme] - Nom: " + lance.getNomArme() +
                ", Degats de base : " + lance.getDegatsArme() +
                ", Coup critique, dégats infligés : " + lance.calculerDegats() +
                ", Type Elémentaire: " + lance.getTypeElementaireArme() +
                ", Chance de Coup Critique: " + lance.getCoupCritiqueArme() * 100 + "%");
    }
}