# Space Invaders 

Space Invaders est un jeu de tir spatial fixe en deux dimensions. Le joueur contrôle un vaisseau spatial qu'il peut déplacer horizontalement, au bas de l'écran. Dans les airs, des rangées d'envahisseurs se déplacent latéralement tout en se rapprochant progressivement du sol et en lançant des missiles. L'objectif est de détruire avec le vaisseau spatial une vague ennemie, qui se compose de cinq rangées de onze envahisseurs chacune, avant qu'elle n'atteigne le bas de l'écran. Le joueur gagne des points à chaque fois qu'il détruit un envahisseur. Le jeu n'autorise qu'un tir à la fois et permet d'annuler ceux des ennemis en tirant dessus. La vitesse et la musique s'accélèrent au fur et à mesure que le nombre d'envahisseur diminue. L'élimination totale de ces derniers amène une nouvelle vague ennemie plus difficile, et ce indéfiniment. Le jeu ne se termine que lorsque le joueur perd, ce qui en fait le premier jeu sans fin.

Les envahisseurs tentent de détruire le vaisseau en tirant dessus pendant qu'ils s'approchent du bas de l'écran. S'ils l'atteignent ou arrivent jusqu'au sol, ils ont réussi leur invasion et le jeu est fini. De temps en temps, un vaisseau spatial apparait tout en haut de l'écran et fait gagner des points bonus s'il est détruit. Quatre bâtiments destructibles permettent au joueur de se protéger des tirs ennemis. Ces défenses se désintègrent progressivement sous l'effet des projectiles adverses et de ceux du joueur. Le nombre de bâtiments n'est pas le même d'une version à l'autre.

## Sommaire
* [Semaine 1 : 30 Mars au 5 Avril 2020](#semaine1)
* [Semaine 2 : 6 Avril au 12 Avril 2020](#semaine2)
* [Semaine 3 : 13 Avril au 19 Avril 2020](#semaine3)
* Glossaire


## Semaine N°1 : du 30 Mars au 5 Avril 2020 <a id="semaine1"></a>

### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

- Story n°1 : Créer un espace de jeu  
Un espace de jeu est créé aux dimensions données (2D) 
Cet espace de jeu est vide

-  Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu  
Un nouveau vaisseau est créé
Le vaisseau est positionné aux coordonnées transmises
Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
La position souhaitée est transmise par ses coordonnées x et y.
Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    

- Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la droite 
Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


- Story n°4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu  
Le vaisseau se déplace d'un pas vers la gauche 
Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

### Fonctionnalité en cours d’implémentation : 
Aucune


### Diagramme de classes 

![Diagrammes de classes de la semaine 1](images/DiagrammeClasses_Semaine1.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe par Mme Blasquez)
 
![Nuage de mots de la semaine 1](images/NuageMots_Semaine1.png)


### Difficultés rencontrées 
Aucune

### Remarques diverses
Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

-------------

## Semaine N°2 : du 6 au 12 Avril 2020 <a id="semaine2"></a>

Reprendre les rubriques de la semaine précédente et les compléter avec le travail réalisé cette semaine

 
### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°2 : Dimensionner le vaisseau

- Etape n°1 : Positionner un nouveau vaisseau avec une dimension donnée
- Etape n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu
- Etape n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension
- Etape n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension


#### Fonctionnalité n°y : Nommer la fonctionnalité

- Story développée pour réaliser cette implémentation  
critère d'acceptance pour cette story  
encore un autre critère d'acceptance pour cette story

*Remarque : La liste des fonctionnalités peut varier d’une séance à l’autre, d’une personne à l'autre puisque chacun avance à son rythme pendant une séance de TP* 


### Fonctionnalité en cours d'implémentation 
Si une fonctionnalité est en cours de développement, **citer cette fonctionnalité** et ses critères d'acceptance, sinon mentionner **aucune**.



### Diagramme de classes 

Insérez ici une image du diagramme de classes que vous aurez au préalable déposer dans le répertoire images.  
Seul le diagramme de classes des classes **metier** vous est demandé ici.   
Vous ne représenterez pas sur ce diagramme les classes du **moteurJeu**.  
Si vous êtes sous Eclipse, vous pouvez générer ce diagramme de classes à partir de votre code à l’aide du plug-in Object Aid UML Explorer dont le tutoriel est disponible [ici](https://github.com/iblasquez/tuto_ModelisationUML/tree/master/ObjectAid)  
Rappel : pour sauvegarder le diagramme, appelez `Save As Image ` à l’aide d’un clic droit.



### Nuage de mots 

Insérez ici une image du nuage de mots que vous aurez au préalable déposer dans le répertoire images. 
 
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe)

Le nuage de mots sera réalisé à l’aide de Source Code Word Cloud Generator et du contenu du fichier `JavaBlacklist.txt` disponible [ici](https://github.com/iblasquez/enseignement-iut-m2104-conception/tree/master/ressources).  
Si vous utilisez un autre outil que celui-là pour générer ce nuage de mots, précisez-le.
Le nuage de mots sera généré sur les classes métier ne pas prendre en compte les classes du moteur graphique quand celui-ci sera mis en place.

 


### Difficultés rencontrées 
Aucune

### Remarques diverses
A vous de compléter si vous en éprouvez le besoin


-------------




## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

* **Envahisseur**  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.


* **Missile** :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

La définition des termes métiers relatifs au projet doit se trouver dans le glossaire 
Ce glossaire doit être compléter au fil des séances...

------------- 


