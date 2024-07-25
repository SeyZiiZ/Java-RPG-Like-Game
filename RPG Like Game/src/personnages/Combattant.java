package personnages;
import bases.Personnage;

public class Combattant extends Personnage {
    public Combattant(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense);
        this.pointsDeMagie = Math.max(0, Math.min(pointsDeMagie, 25));
    }

    @Override
    public void narguer() {
        System.out.println(this.prenom + " " + this.nom + " nargue le monstre");
    }

    @Override
    public String getTypePersonnage() {
        return "Combattant";
    }

}