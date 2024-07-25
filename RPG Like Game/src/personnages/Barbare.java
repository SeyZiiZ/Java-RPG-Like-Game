package personnages;

public class Barbare extends Combattant {
    public Barbare(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense);
        this.attaque = Math.max(10, Math.min(attaque, 15));
        this.defense = Math.max(5, Math.min(defense, 10));
    }

    @Override
    public void narguer() {
        System.out.println(this.prenom + " " + this.nom + " nargue le monstre");
    }

    @Override
    public String getTypePersonnage() {
        return "Barbare";
    }
}

