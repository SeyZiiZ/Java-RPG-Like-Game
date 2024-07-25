package Tests;

import monstres.Dragon;
import monstres.Gobelin;
import monstres.Monstre;
import monstres.Vampire;
import utilitaires.TypeElementaire;

public class TestMonstre {
    public static void main(String[] args) {
        // Gobelin
        Gobelin monGobelin = new Gobelin("Affreux", "Personnage", 40, 7, 10, TypeElementaire.TERRE);
        System.out.println("[Gobelin] - " + monGobelin.toString());
        //
        monGobelin.utiliserCapaciteSpeciale();
        System.out.println("[Gobelin] - Apres la capacité speciale l'attaque = " + monGobelin.getAttaqueTemporaire());
        // Fin

        System.out.println(" - ");

        //Vampire
        Vampire monVampire = new Vampire("Longues", "Dents", 54, 15, 30, TypeElementaire.METAL);
        System.out.println("[Vampire] - " + monVampire.toString());
        //
        monVampire.utiliserCapaciteSpeciale();

        // Fin

        System.out.println(" - ");

        // Dragon
        Dragon monDragon = new Dragon("Grandes", "Ailes", 99, 38, 20,TypeElementaire.FEU);
        System.out.println("[Dragon] - " + monDragon.toString());
        //
        monDragon.utiliserCapaciteSpeciale();
        //Fin

    }
}

