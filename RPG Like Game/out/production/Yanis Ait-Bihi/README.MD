# Projet POO Java

## Auteur

- Nom / Prénom: [ AIT-BIHI Yanis X-BAC-DEV Groupe 1 ]

## Version de Java Utilisée

- Java version: [ Version de Java utilisée : " java version "1.8.0_401 ( 8 ) " ]

## Instructions pour Lancer l'Application

Pour lancer cette application, suivez ces étapes dans votre terminal ou invite de commande :

1. Assurez-vous que Java est correctement installé sur votre système et que la version correspond à celle mentionnée ci-dessus.
2. Naviguez jusqu'au dossier racine du projet.
3. Compilez le code source. Si tous vos fichiers Java sont dans un dossier `src`, vous pouvez utiliser la commande suivante :
4. Cela compilera vos fichiers `.java` dans le dossier `src` et mettra les fichiers `.class` compilés dans un dossier `bin`.
5. Pour exécuter votre application, utilisez la commande :

Assurez-vous que le point d'entrée de votre application (la classe contenant `public static void main(String[] args)`) se trouve dans le chemin spécifié après `-cp`.

## Règle Métier Appliquée pour l'Entité Personnage

Dans ce projet, chaque **Personnage** est défini par une série d'attributs qui influencent directement leurs capacités dans le jeu, notamment lors des combats contre des monstres. Voici quelques-unes des règles métier clés appliquées aux personnages :

- **Attributs de Base** : Chaque personnage possède des points de vie (`pointsDeVie`), des points de magie (`pointsDeMagie`), une capacité d'attaque (`attaque`) et de défense (`defense`). Ces attributs déterminent leur résilience, leur puissance offensive, et leur capacité à résister aux attaques.

- **Interactions avec les Monstres** : Les personnages peuvent attaquer des monstres en utilisant leur capacité d'attaque combinée aux dégâts de leur arme équipée (`arme`). Ils peuvent également recevoir des dégâts lorsqu'ils sont attaqués par des monstres, avec la possibilité de réduire les dégâts reçus grâce à leur niveau de défense.

- **Équipement** : Les personnages peuvent être équipés d'une arme (`Arme`), qui augmente leur puissance d'attaque. Lorsqu'une arme est assignée, les dégâts totaux infligés lors d'une attaque incluent à la fois l'attaque de base du personnage et les dégâts de l'arme.

- **Actions Spécifiques** :
  - **Narguer** : Les personnages ont la capacité de narguer leur adversaire, une action qui ne cause pas de dégâts mais peut avoir d'autres effets dans une version plus élaborée du jeu.
  - **Fuir** : Ils ont également la possibilité de tenter de fuir le combat. Cette action a une chance de succès basée sur un tirage aléatoire, offrant une stratégie de repli si le combat s'avère trop difficile.

## Règle Métier Appliquée pour l'Entité Monstre

Dans ce projet, l'entité **Monstre** joue un rôle crucial en tant qu'adversaire des personnages joueurs. Voici les principes clés qui régissent le comportement et les caractéristiques des monstres dans le jeu :

- **Attributs Fondamentaux** : Chaque monstre est défini par son nom, prénom, points de vie (`pointsDeVie`), attaque de base (`attaqueBase`), défense (`defense`), et type élémentaire (`typeElementaire`). Ces attributs influencent directement sa capacité à combattre, sa résilience face aux attaques, et ses interactions élémentaires avec les personnages joueurs.

- **Capacité Spéciale** : Les monstres disposent d'une capacité spéciale unique (`utiliserCapaciteSpeciale`), qui peut être invoquée pendant le combat pour infliger des effets supplémentaires ou augmenter les dégâts. Cette capacité ajoute une dimension stratégique aux combats, obligeant les joueurs à adapter leurs tactiques.

- **Mécanisme d'Attaque** : Lorsqu'un monstre attaque (`attaquer`), il inflige des dégâts à sa cible basés sur son `attaqueBase`. La défense de la cible peut réduire ces dégâts, mais les points de vie de la cible seront diminués en fonction des dégâts nets reçus.

- **Réception de Dégâts** : Les monstres peuvent recevoir des dégâts de la part des personnages joueurs. Les dégâts reçus sont ajustés en fonction de la défense du monstre, soulignant l'importance de l'équilibre entre l'attaque et la défense dans les mécanismes de combat.

- **Interaction Élémentaire** : Le type élémentaire d'un monstre (`TypeElementaire`) influence ses forces et faiblesses face aux attaques élémentaires des personnages joueurs, introduisant une couche supplémentaire de tactique basée sur les affinités élémentaires.



## Règle Métier Appliquée pour l'Entité Arme ou Armure

- Pour l'entité **Arme**, chaque arme a une chance de réaliser un coup critique. Un coup critique double les dégâts infligés par l'arme lorsqu'il est activé. La probabilité qu'un coup critique se produise est définie pour chaque arme et est calculée à chaque attaque.
- L'armure commence avec un indice d'usure de 100%.
- À chaque attaque subie, l'indice d'usure diminue de 5%.
- La réduction des dégâts offerte par l'armure est directement proportionnelle à son indice d'usure. Par exemple, une armure à 50% d'usure ne réduira les dégâts reçus que de moitié par rapport à sa capacité initiale.
- Lorsque l'indice d'usure atteint 0%, l'armure ne peut plus réduire les dégâts et doit être réparée ou remplacée.

## Règle Métier Appliquée aux Tests Unitaires

Dans le cadre de ce projet, une attention particulière a été portée à l'assurance qualité à travers l'implémentation de tests unitaires pour chaque entité majeure du jeu, incluant les personnages (tels que les Barbare, Combattant, Prêtre), les monstres (Vampire, Dragon, Gobelin), ainsi que les armes. Ces tests ont été conçus pour valider le comportement attendu de chaque entité et garantir la stabilité du jeu. Voici un aperçu de la démarche adoptée :

### Objectif des Tests Unitaires

- **Validation des Attributs et Comportements** : Chaque test unitaire vise à vérifier que les attributs de chaque entité sont correctement initialisés et que leurs méthodes agissent comme attendu. Par exemple, pour un personnage, cela peut inclure la vérification des points de vie initiaux, de la capacité à attaquer, et de la logique de fuite.

- **Tests de Combat** : Des scénarios de combat sont simulés pour tester les interactions entre personnages et monstres, en vérifiant que les calculs de dégâts, les effets des types élémentaires, et les capacités spéciales fonctionnent comme prévu.

- **Intégration des Armes** : Les tests incluent également l'équipement des personnages avec différentes armes pour s'assurer que les bonus de dégâts sont correctement appliqués et que les mécaniques de coup critique sont opérationnelles.

### Mise en Œuvre

- **Instanciation des Entités** : Pour chaque classe d'entité, des instances spécifiques sont créées pour tester divers cas de figure. Par exemple, l'instanciation d'un Barbare ou d'un Prêtre permet de tester les attributs et méthodes uniques à ces classes.

- **Scénarios de Combat** : Des combats sont orchestrés entre les personnages testés et une variété de monstres pour évaluer l'efficacité des attaques, la gestion de la défense, et l'utilisation des capacités spéciales.

- **Utilisation des Armes** : Les personnages sont équipés avec différentes armes instanciées pour valider l'impact de ces équipements sur le déroulement du combat.

### Conclusion

Ces tests unitaires jouent un rôle crucial dans le développement du jeu, permettant de détecter précocement les anomalies et d'assurer une expérience de jeu équilibrée et sans faille. La couverture de test étendue garantit que chaque aspect du jeu fonctionne comme conçu, offrant ainsi une fondation solide pour l'ajout de nouvelles fonctionnalités et entités.



