package personnages;

import personnages.Combattant;

public class Paladin extends Combattant {
    public Paladin(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense);
        this.attaque = Math.max(5, Math.min(attaque, 10));
        this.defense = Math.max(10, Math.min(defense, 15));
    }

    public void seSoigner() {
        if (this.pointsDeMagie >= 5) {
            this.pointsDeVie = 100;
            this.pointsDeMagie -= 5;
        }
    }

    @Override
    public String getTypePersonnage() {
        return "Paladin";
    }
}
