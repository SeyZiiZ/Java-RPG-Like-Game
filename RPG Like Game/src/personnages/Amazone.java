package personnages;

public class Amazone extends Combattant {
    public Amazone(String nom, String prenom, int pointsDeVie, int pointsDeMagie, int attaque, int defense) {
        super(nom, prenom, pointsDeVie, pointsDeMagie, attaque, defense);
        this.attaque = Math.max(7, Math.min(attaque, 12));
        this.defense = Math.max(7, Math.min(defense, 12));
    }

    @Override
    public String getTypePersonnage() {
        return "Amazone";
    }
}

