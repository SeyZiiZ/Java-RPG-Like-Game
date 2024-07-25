package monstres;

import bases.Personnage;
import utilitaires.TypeElementaire;

public abstract class Monstre {
    protected String nom;
    protected String prenom;
    protected int pointsDeVie;
    protected int attaqueBase;
    protected int defense;
    protected TypeElementaire typeElementaire;


    public Monstre(String nom, String prenom, int pointsDeVie, int attaqueBase, int defense, TypeElementaire typeElementaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.pointsDeVie = Math.max(0, Math.min(pointsDeVie, 100));
        this.attaqueBase = attaqueBase;
        this.defense = defense;
        this.typeElementaire = typeElementaire;
    }

    public abstract void utiliserCapaciteSpeciale();

    public void attaquer(Personnage cible) {
        System.out.println(this.nom + " " + this.prenom + " attaque " + cible.getPrenom() + " " + cible.getNom() + " et inflige " + this.attaqueBase + " points de dégâts.");
        cible.recevoirDegats(this.attaqueBase);
    }

    public void recevoirDegats(int degats) {
        int degatsNets = degats - this.defense;
        degatsNets = Math.max(0, degatsNets);
        this.pointsDeVie -= degatsNets;
        this.pointsDeVie = Math.max(0, this.pointsDeVie);

        System.out.println(this.nom + " " + this.prenom + " reçoit " + degatsNets + " points de dégâts. Points de vie restants : " + this.pointsDeVie);
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", " + pointsDeVie + " PV, " + "Attaque: " + attaqueBase + ", Défense: " + defense + " Type : " + typeElementaire;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getTypeMonstre() {
        return "Monstree";
    }

}

