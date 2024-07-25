package personnages;

import utilitaires.TypeElementaire;

public class Pretre extends Magicien {
    public Pretre(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense, typeElementaire);
    }

    public void seSoigner() {
        if (this.pointsDeMagie >= 5) {
            this.pointsDeMagie -= 5;

            this.pointsDeVie = 70;

            System.out.println(this.nom + " " + this.prenom + " utilise son pouvoir de soin, ses points de vie ont été restaurés complètement");
        } else {
            System.out.println(this.nom + " " + this.prenom + " n'a pas assez de points de magie pour se soigner");
        }
    }

    @Override
    public String getTypePersonnage() {
        return "Pretre";
    }
}

