package monstres;

import bases.Personnage;
import utilitaires.TypeElementaire;

public class Gobelin extends Monstre {
    private int attaqueTemporaire; // Pour gérer l'augmentation temporaire de l'attaque

    public Gobelin(String nom, String prenom, int pointsDeVie, int attaqueBase, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, pointsDeVie, attaqueBase, defense, typeElementaire);
        this.attaqueBase = attaqueBase;
        this.attaqueTemporaire = attaqueBase; // Initialement, l'attaque temporaire est égale à l'attaque de base
    }

    @Override
    public void utiliserCapaciteSpeciale() {
        System.out.println("[Gobelin] - " + this.nom + " " + this.prenom + " utilise Empaler ! Cela ajoute 10 de dégâts à son attaque principale pour le prochain coup.");
        this.attaqueTemporaire += 10;
    }

    public void attaquer(Personnage cible) {
        System.out.println(this.prenom + " " + this.nom + " attaque " + cible.getPrenom() + " " + cible.getNom() + " avec " + this.attaqueTemporaire + " de degats.");
        cible.recevoirDegats(this.attaqueTemporaire);

        if (this.attaqueTemporaire != this.attaqueBase) {
            System.out.println(this.prenom + " " + this.nom + " L'attaque revient à la valeur de base !");
            this.attaqueTemporaire = this.attaqueBase;
        }
    }
    public int getAttaqueTemporaire() {
        return attaqueTemporaire;
    }

    @Override
    public String getTypeMonstre() {
        return "Gobelin";
    }

}

