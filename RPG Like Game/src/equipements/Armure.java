package equipements;

import utilitaires.TypeElementaire;

public class Armure {
    private String nom;
    private int protection;
    private TypeElementaire typeElementaire;
    private double indiceUsage;

    public Armure(String nom, int protection, TypeElementaire typeElementaire, double indiceUsage) {
        this.nom = nom;
        this.protection = protection;
        this.typeElementaire = typeElementaire;
        this.indiceUsage = indiceUsage;
    }

    public void reduireIndiceUsage(int degats) {
        double reduction = (degats - protection) / 10.0;
        indiceUsage -= reduction;
        if (indiceUsage < 0) {
            indiceUsage = 0;
        }

        System.out.println(nom + " : L'indice d'usage est maintenant à " + indiceUsage + "%");
    }

    public String getNom() {
        return nom;
    }

    public int getProtection() {
        return protection;
    }

    public TypeElementaire getTypeElementaire() {
        return typeElementaire;
    }

    public double getIndiceUsage() {
        return indiceUsage;
    }

    public void setIndiceUsage(double indiceUsage) {
        this.indiceUsage = indiceUsage;
    }
}
