package monstres;

import bases.Personnage;
import utilitaires.TypeElementaire;

public class Vampire extends Monstre {
    private int attaqueBase;

    public Vampire(String nom, String prenom, int pointsDeVie, int attaqueBase, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, pointsDeVie, attaqueBase, defense, typeElementaire);
        this.attaqueBase = attaqueBase;
    }

    @Override
    public void utiliserCapaciteSpeciale() {
        System.out.println("[Vampire] - " + this.nom + " " + this.prenom + " active sa capacité spéciale Absorption !");
    }

    public void attaquer(Personnage cible) {
        System.out.println(this.prenom + " " + this.nom + " attaque " + cible.getPrenom() + " " + cible.getNom() + " avec " + this.attaqueBase + " de dégâts.");

        int soin = (int) Math.ceil(this.attaqueBase * 0.33); // 33% des dégâts infligés, arrondi au nombre supérieur

        this.pointsDeVie += soin;
        if (this.pointsDeVie > 100) this.pointsDeVie = 100; // Assure que les points de vie ne dépassent pas le maximum

        System.out.println(this.prenom + " " + this.nom + " se régénère de " + soin + " points de vie grâce à Absorption. Points de vie actuels : " + this.pointsDeVie);

        cible.recevoirDegats(this.attaqueBase);
    }
    @Override
    public String getTypeMonstre() {
        return "Vampire";
    }
}



