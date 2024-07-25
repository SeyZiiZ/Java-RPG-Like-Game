package equipements;

import utilitaires.TypeElementaire;
import java.util.Random;

public class Arme {
    private String nom;
    private int degats;
    private TypeElementaire typeElementaire;
    private double CoupCritique;

    public Arme(String nom, int degats, TypeElementaire typeElementaire, double CoupCritique) {
        this.nom = nom;
        this.degats = degats;
        this.typeElementaire = typeElementaire;
        this.CoupCritique = CoupCritique;
    }

    public String getNomArme() {
        return nom;
    }

    public int getDegatsArme() {
        return degats;
    }

    public TypeElementaire getTypeElementaireArme() {
        return typeElementaire;
    }

    public double getCoupCritiqueArme() {
        return CoupCritique;
    }

    public int calculerDegats() {
        if (new Random().nextDouble() < CoupCritique) {
            System.out.println("Coup critique ! Dégâts doublés pour " + nom + ".");
            return degats * 2; // Dégâts doublés en cas de coup critique
        } else {
            return degats; // Dégâts normaux sinon
        }
    }
}

