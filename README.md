# Space Invaders 

Space Invaders est un jeu de tir spatial fixe en deux dimensions. Le joueur contrôle un vaisseau spatial qu'il peut déplacer horizontalement, au bas de l'écran. Dans les airs, des rangées d'envahisseurs se déplacent latéralement tout en se rapprochant progressivement du sol et en lançant des missiles. L'objectif est de détruire avec le vaisseau spatial une vague ennemie, qui se compose de cinq rangées de onze envahisseurs chacune, avant qu'elle n'atteigne le bas de l'écran. Le joueur gagne des points à chaque fois qu'il détruit un envahisseur. Le jeu n'autorise qu'un tir à la fois et permet d'annuler ceux des ennemis en tirant dessus. La vitesse et la musique s'accélèrent au fur et à mesure que le nombre d'envahisseur diminue. L'élimination totale de ces derniers amène une nouvelle vague ennemie plus difficile, et ce indéfiniment. Le jeu ne se termine que lorsque le joueur perd, ce qui en fait le premier jeu sans fin.

Les envahisseurs tentent de détruire le vaisseau en tirant dessus pendant qu'ils s'approchent du bas de l'écran. S'ils l'atteignent ou arrivent jusqu'au sol, ils ont réussi leur invasion et le jeu est fini. De temps en temps, un vaisseau spatial apparait tout en haut de l'écran et fait gagner des points bonus s'il est détruit. Quatre bâtiments destructibles permettent au joueur de se protéger des tirs ennemis. Ces défenses se désintègrent progressivement sous l'effet des projectiles adverses et de ceux du joueur. Le nombre de bâtiments n'est pas le même d'une version à l'autre.

## Sommaire
* [Semaine 1 : 30 Mars au 5 Avril 2020](#semaine1)
* [Semaine 2 : 6 Avril au 12 Avril 2020](#semaine2)
* [Semaine 3 : 13 Avril au 19 Avril 2020](#semaine3)
* [Semaine 4 : 04 Mai au 10 Mai 2020](#semaine4)
* [Glossaire](#glossaire)




## Semaine N°1 : du 30 Mars au 5 Avril 2020 <a id="semaine1"></a>

### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (Terminée)

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

![Diagrammes de classes de la semaine 1](images/DiagClasses_S1_Fin.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe par Mme Blasquez)
 
![Nuage de mots de la semaine 1](images/WordCloud_S1.png)


### Difficultés rencontrées 
Aucune

### Remarques diverses
Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

-------------

## Semaine N°2 : du 6 au 12 Avril 2020 <a id="semaine2"></a>

Reprendre les rubriques de la semaine précédente et les compléter avec le travail réalisé cette semaine

 
### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°2 : Dimensionner le vaisseau (Terminée)

- Etape n°1 : Positionner un nouveau vaisseau avec une dimension donnée
Le nouveau vaisseau est positionné aux coordonnées données.
- Etape n°2 : Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu
Si un vaisseau est positionné en dehors de l'espace de jeu, alors une exception est lévé. Une autre exception sera également levée si le vaisseau est positionné en partie en dehors de l'espace de jeu. Le point d'origine du repère se situe en haut à gauche. Les coordonnées du vaisseau saisies correspondent aux coordonnées du point inférieur gauche du vaisseau.
- Etape n°3 : Déplacer un vaisseau vers la droite en tenant compte de sa dimension
- Etape n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension


#### Fonctionnalité n°3 : Choisir la vitesse du vaisseau (Terminée)

- Etape n°1 : Ajouter la vitesse au vaisseau sans régression de comportement
- Etape n°2 : Régler la vitesse du vaisseau
- Etape n°3 : Faire en sorte que le déplacement se fasse correctmement pour une vitesse quelconque


### Fonctionnalité en cours d'implémentation 
Aucune

### Diagramme de classes 

![Diagrammes de classes de la semaine 2](images/DiagClasses_S2_Fin.png)

### Nuage de mots 
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe par Mme Blasquez)
![Nuage de mots de la semaine 2](images/WordCloud_S2.png)
 


### Difficultés rencontrées 
Aucune

### Remarques diverses
Aucune


-------------

## Semaine N°3 : du 13 au 19 Avril 2020 <a id="semaine3"></a>

### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°4 : Tirer un missile depuis le vaisseau
- Quick Design Session : Comprendre ce qu'est un missile et refactorer
  Définition d'un sprite. Un peu de refactoring a été necessaire, avec la création d'une Super-Classe : Sprite ; Vaisseau devient une sous-classe de Sprite. Pour terminer, on a modifié les constructeurs des classes Sprite et Vaisseau afin d'alléger le code, car certains étaient devenus obsolètes.

### Fonctionnalité en cours d’implémentation : 
Aucune

### Diagramme de classes 

![Diagrammes de classes de la semaine 3](images/DiagClasses_S3_Fin.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe par Mme Blasquez)
 
![Nuage de mots de la semaine 3](images/WordCloud_S3.png)


### Difficultés rencontrées 
Aucune

-------------
## Semaine N°4 : du 04 au 10 Mai 2020 <a id="semaine4"></a>

### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°5 : Ajouter un envahisseur dans le jeu
Ajout de nouveaux tests pour contrôler que l'envahisseur reste dans les limtes de jeu. 

### Diagramme de classes 

![Diagrammes de classes de la semaine 3](images/DiagClasses_S4_Fin.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  
(généré à l’aide de Source Code Word Cloud Generator avec la liste JavaBlacklist.txt fournie en annexe par Mme Blasquez)
 
![Nuage de mots de la semaine 3](images/WordCloud_S4.png)


### Difficultés rencontrées 
Le passage en autonomie totale est un peu rude au départ ! Après la création d'une classe Envahisseur hérité de la classe Sprite comme tout objet pouvant se déplacer. 



-------------




## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

* **Envahisseur**  :  ennemi qui apparaît à l'écran, se déplace automatiquement de droite à gauche et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.


* **Missile** :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire. Le missile ets envoyé depuis le milieu du vaisseau

* **Vitesse** : Grandeur physique correspondant aux déplacements du vaisseau. 
* **Sprite** : Ce terme désigne un élément graphique se déplaçant sur l'écran, comme un missile ou un vaisseau par exemple...

------------- 


