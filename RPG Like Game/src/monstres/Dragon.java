package monstres;

import bases.Personnage;
import utilitaires.TypeElementaire;

import java.util.Random;

public class Dragon extends Monstre {
    public Dragon(String nom, String prenom, int pointsDeVie, int attaqueBase, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, pointsDeVie, attaqueBase, defense, typeElementaire);
    }

    @Override
    public void utiliserCapaciteSpeciale() {
        System.out.println("[Dragon] - " + this.nom + " " + this.prenom + " utilise sa capacité spéciale Souffle !");
    }

    public void attaquer(Personnage cible) {
        System.out.println(this.prenom + " " + this.nom + " attaque " + cible.getPrenom() + " " + cible.getNom() + " avec " + this.attaqueBase + " de dégâts.");


        if (new Random().nextInt(100) < 20) {
            utiliserCapaciteSpeciale();
            int degatsPourReduireAUnPV = Math.max(0, cible.getPointsDeVie() - 1);
            cible.recevoirDegats(degatsPourReduireAUnPV);
            System.out.println("La capacité spéciale Souffle est utilisée, réduisant les points de vie de " + cible.getPrenom() + " " + cible.getNom() + " à 1.");
        } else {
            cible.recevoirDegats(this.attaqueBase);
        }
    }
    @Override
    public String getTypeMonstre() {
        return "Dragon";
    }
}

