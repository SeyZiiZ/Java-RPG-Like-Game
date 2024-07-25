package Tests;

import equipements.Armure;
import utilitaires.TypeElementaire;

public class TestArmure {

    public static void main(String[] Args) {
        Armure bouclier = new Armure("Bouclier Ancien", 10, TypeElementaire.TERRE, 100.0);

        System.out.println("[Armure] - Nom: " + bouclier.getNom() +
                ", Protection: " + bouclier.getProtection() +
                ", Type Élémentaire: " + bouclier.getTypeElementaire() +
                ", Indice d'Usage: " + bouclier.getIndiceUsage() + "%");

        System.out.println("L'armure reçoit 50 points de dégâts...");
        bouclier.reduireIndiceUsage(50);

        System.out.println("[Armure après dégâts] - Nom: " + bouclier.getNom() +
                ", Protection: " + bouclier.getProtection() +
                ", Type Élémentaire: " + bouclier.getTypeElementaire() +
                ", Indice d'Usage: " + bouclier.getIndiceUsage() + "%");

        System.out.println("L'armure reçoit 30 points de dégâts supplémentaires...");
        bouclier.reduireIndiceUsage(30);

        System.out.println("[Armure après plus de dégâts] - Nom: " + bouclier.getNom() +
                ", Protection: " + bouclier.getProtection() +
                ", Type Élémentaire: " + bouclier.getTypeElementaire() +
                ", Indice d'Usage: " + bouclier.getIndiceUsage() + "%");
    }
}

