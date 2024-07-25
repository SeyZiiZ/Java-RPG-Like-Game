package bases;

import equipements.Arme;
import equipements.Armure;
import monstres.Monstre;

import java.util.Random;

public class Personnage {
    protected String nom;
    protected String prenom;
    protected int pointsDeVie;
    protected int pointsDeMagie;
    protected int attaque;
    protected int defense;
    protected Arme arme;
    protected Armure armure;

    public Personnage(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense) {
        this.nom = nom;
        this.prenom = prenom;
        this.pointsDeVie = pointsDeVie;
        this.pointsDeMagie = pointsDeMagie;
        this.attaque = attaque;
        this.defense = defense;
    }

    public void narguer() {
        System.out.println(this.nom + " " + this.prenom + " nargue le monstre");
    }

    public boolean fuir() {
        int chance = new Random().nextInt(5);
        if (chance < 2) {
            System.out.println(this.nom + " " + this.prenom + " a fuis le combat !");
            return true;
        } else {
            System.out.println(this.nom + " " + this.prenom + " reste au combat !");
            return false;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void recevoirDegats(int degats) {
        int degatsNets = degats - this.defense;
        if (degatsNets < 0) {
            degatsNets = degats / 2;
        }
        this.pointsDeVie -= degatsNets;
        if (this.pointsDeVie < 0) {
            this.pointsDeVie = 0;
        }
        System.out.println(this.prenom + " " + this.nom + " reçoit " + degatsNets + " points de dégâts. Points de vie restants : " + this.pointsDeVie);
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getAttaque() {
        return attaque;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", " + pointsDeVie + " PV, " + pointsDeMagie + " PM, Attaque: " + attaque + ", Défense: " + defense;
    }

    public void attaquer(Monstre monstre) {
        int degatsTotals = this.attaque;

        if (this.arme != null) {
            degatsTotals += this.arme.calculerDegats();
        }

        System.out.println(this.nom + " " + this.prenom + " attaque " + monstre.getNom() + " " + monstre.getPrenom() + " avec " + degatsTotals + " de dégâts.");
        monstre.recevoirDegats(degatsTotals);
    }


    public String getTypePersonnage() {
        return "Personnage";
    }

    public void setArme(Arme arme) {
        this.arme = arme;
        System.out.println(this.nom + " " + this.prenom + " a maintenant l'arme: " + arme.getNomArme());
    }
    public Arme getArme() {
        return this.arme;
    }
}






