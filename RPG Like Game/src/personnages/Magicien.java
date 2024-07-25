package personnages;

import bases.Personnage;
import monstres.Monstre;
import utilitaires.TypeElementaire;

public class Magicien extends Personnage {
    public Magicien(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, Math.min(pointsDeVie, 70), pointsDeMagie, attaque, defense);
    }

    public void jeterSort(Monstre monstre) {
        int coutMagieSort = 7;
        int degatsSort = 15;

        if (this.pointsDeMagie >= coutMagieSort) {
            this.pointsDeMagie -= coutMagieSort;
            monstre.recevoirDegats(degatsSort);
            System.out.println("Le personnages " + this.nom + " " +this.prenom + " lance un sort et inflige " + degatsSort + " degats au monstre!");
        } else {
            System.out.println("Pas assez de points de magie pour lancer le sort.");
        }
    }

    @Override
    public String getTypePersonnage() {
        return "Magicien";
    }

}

