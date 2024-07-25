package main;

import bases.Personnage;
import equipements.Arme;
import monstres.*;
import personnages.*;
import utilitaires.TypeElementaire;

import java.util.ArrayList;
import java.util.List;

public class Config {

    public static List<Personnage> creerPersonnages() {
        List<Personnage> personnages = new ArrayList<>();
        personnages.add(new Combattant("LaBrute", "Ancienne", 100, 15, 20, 10));
        personnages.add(new Barbare("LeFou", "Jean", 80, 20, 12, 7));
        personnages.add(new Magicien("LeMysterieux", "Magelan", 60, 7, 30, 5, TypeElementaire.FEU));
        personnages.add(new Amazone("Amazonie", "DeAmazon", 100, 8, 11, 9));
        personnages.add(new Mage("LeLouche", "Magique", 40, 7, 15, 13, TypeElementaire.EAU));
        personnages.add(new Paladin("Pala", "Din", 80, 20, 6, 12));
        personnages.add(new Pretre("Mono", "Tone", 40, 5, 40, 30, TypeElementaire.METAL));
        return personnages;
    }

    public static List<Monstre> creerMonstres() {
        List<Monstre> monstres = new ArrayList<>();
        monstres.add(new Gobelin("Affreux", "Personnage", 40, 7, 10, TypeElementaire.TERRE));
        monstres.add(new Vampire("Longues", "Dents", 54, 15, 30, TypeElementaire.METAL));
        monstres.add(new Dragon("Grandes", "Ailes", 99, 38, 20, TypeElementaire.FEU));
        return monstres;
    }

    public static List<Arme> creerArmes() {
        List<Arme> armes = new ArrayList<>();
        armes.add(new Arme("Epée du destin", 55, TypeElementaire.FEU, 0.3));
        armes.add(new Arme("Javelot de la trinité", 45, TypeElementaire.BOIS, 0.1));
        armes.add(new Arme("Lance du pouvoir", 65, TypeElementaire.METAL, 0.2));
        return armes;
    }
}
