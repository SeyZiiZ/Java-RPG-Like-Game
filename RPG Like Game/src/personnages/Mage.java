package personnages;
import utilitaires.TypeElementaire;

public class Mage extends Magicien {
    public Mage(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense, TypeElementaire typeElementaire) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense, typeElementaire);
    }

    public void lancerSortParticulier() {
        System.out.println(this.getPrenom() + " " + this.getNom() + " lance un sort particulier unique aux Mages.");
    }

    @Override
    public String getTypePersonnage() {
        return "Mage";
    }

}
