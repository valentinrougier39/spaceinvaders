package fr.unilim.iut.spaceinvaders.model;
import fr.unilim.iut.spaceinvaders.moteurjeu.*;
import fr.unilim.iut.spaceinvaders.utils.*;

public class SpaceInvaders implements Jeu {

    	
		int longueur;
	    int hauteur;
	    Vaisseau vaisseau;
	    Missile missile;
	    Envahisseur envahisseur;
	    
	    public SpaceInvaders(int longueur, int hauteur) {
		   this.longueur = longueur;
		   this.hauteur = hauteur;
	   }
	    
	    public String recupererEspaceJeuDansChaineASCII() {
			StringBuilder espaceDeJeu = new StringBuilder();
			
			for (int y = 0; y < hauteur; y++) {
				for (int x = 0; x < longueur; x++) {
					espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
				}
				espaceDeJeu.append(Constante.MARQUE_FIN_LIGNE);
			}
			return espaceDeJeu.toString();
		}
	    
	    public void initialiserJeu() {
			Position positionVaisseau = new Position(this.longueur/2,this.hauteur-1);
			Dimension dimensionVaisseau = new Dimension(Constante.VAISSEAU_LONGUEUR, Constante.VAISSEAU_HAUTEUR);
			positionnerUnNouveauVaisseau(dimensionVaisseau, positionVaisseau, Constante.VAISSEAU_VITESSE);
			envahisseur = new Envahisseur(new Dimension(Constante.ENVAHISSEUR_HAUTEUR, Constante.ENVAHISSEUR_LONGUEUR), new Position(longueur/2, hauteur/2), Constante.ENVAHISSEUR_VITESSE);
		 }
	    /*
	    public void deplacerVaisseauVersLaDroite() {
			if (vaisseau.abscisseLaPlusADroite() < (longueur - 1)) {
				vaisseau.deplacerHorizontalementVers(Direction.DROITE);
				if (!estDansEspaceJeu(vaisseau.abscisseLaPlusADroite(), vaisseau.ordonneeLaPlusHaute())) {
					vaisseau.positionner(longueur - vaisseau.dimension.longueur, vaisseau.ordonneeLaPlusHaute());
				}
			}
		}
	    */
	    public void deplacerSpriteVersLaDroite(Sprite sprite) {
	    	if (sprite.abscisseLaPlusADroite() < (longueur - 1)) {
	    		sprite.deplacerHorizontalementVers(Direction.DROITE);
				if (!estDansEspaceJeu(sprite.abscisseLaPlusADroite(), sprite.ordonneeLaPlusHaute())) {
					sprite.positionner(longueur - sprite.dimension.longueur, sprite.ordonneeLaPlusHaute());
				}
			}
	    }
	    public void deplacerSpriteVersLaGauche(Sprite sprite) {
	    	if (0 < sprite.abscisseLaPlusAGauche())
				sprite.deplacerHorizontalementVers(Direction.GAUCHE);
			if (!estDansEspaceJeu(sprite.abscisseLaPlusAGauche(), sprite.ordonneeLaPlusHaute())) {
				sprite.positionner(0, sprite.ordonneeLaPlusHaute());
			}
	    }
	    
	    /*
	    public void deplacerVaisseauVersLaGauche() {
			if (0 < vaisseau.abscisseLaPlusAGauche())
				vaisseau.deplacerHorizontalementVers(Direction.GAUCHE);
			if (!estDansEspaceJeu(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusHaute())) {
				vaisseau.positionner(0, vaisseau.ordonneeLaPlusHaute());
			}
		}
*/
		private boolean estDansEspaceJeu(int x, int y) {
			return ((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur));
		}
	    
		public boolean aUnVaisseau() {
			return vaisseau!=null;
		}	
		
		private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
			return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);
		}

		  	private char recupererMarqueDeLaPosition(int x, int y) {
				char marque;
				if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
					marque = Constante.MARQUE_VAISSEAU;
				else if (this.aUnMissileQuiOccupeLaPosition(x, y))
						marque = Constante.MARQUE_MISSILE;
				else if (this.aUnEnvahisseurQuiOccupeLaPosition(x,y))
					marque = Constante.MARQUE_ENVAHISSEUR;
				else marque = Constante.MARQUE_VIDE;
				return marque;
			}

		
		private boolean aUnEnvahisseurQuiOccupeLaPosition(int x, int y) {
			return this.aUnEnvahisseur() && envahisseur.occupeLaPosition(x, y);
		}

		public void positionnerUnNouveauVaisseau(Dimension dimension, Position position, int vitesse) {
			
			int x = position.abscisse();
			int y = position.ordonnee();
			
			if (!estDansEspaceJeu(x, y))
				throw new HorsEspaceJeuException("La position du vaisseau est en dehors de l'espace jeu");

			int longueurVaisseau = dimension.longueur();
			int hauteurVaisseau = dimension.hauteur();
			
			if (!estDansEspaceJeu(x + longueurVaisseau - 1, y))
				throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers la droite à cause de sa longueur");
			if (!estDansEspaceJeu(x, y - hauteurVaisseau + 1))
				throw new DebordementEspaceJeuException("Le vaisseau déborde de l'espace jeu vers le bas à cause de sa hauteur");

			vaisseau = new Vaisseau(dimension,position,vitesse);
			
		
		}
		
		public void positionnerUnNouveauEnvahisseur(Dimension dimension, Position position, int vitesse) {
			int x = position.abscisse();
			int y = position.ordonnee();
		
			if (!estDansEspaceJeu(x, y))
				throw new HorsEspaceJeuException("La position de l'envahisseur est en dehors de l'espace jeu");
			
			int longueurEnvahisseur = dimension.longueur;
			int hauteurEnvahisseur = dimension.hauteur;
			
			if (!estDansEspaceJeu(x + longueurEnvahisseur - 1, y))
				throw new DebordementEspaceJeuException("L'envahisseur déborde de l'espace jeu vers la droite à cause de sa longueur");
			if (!estDansEspaceJeu(x, y - hauteurEnvahisseur + 1))
				throw new DebordementEspaceJeuException("L'envahisseur déborde de l'espace jeu vers le bas à cause de sa hauteur");
			
			envahisseur = new Envahisseur(dimension,position,vitesse);
		}
		
		
		public Vaisseau recupererVaisseau() {
			return this.vaisseau;
		}
		
		/*Moteur graphique */
		boolean retour = true;
		
		@Override
		public void evoluer(Commande commandeUser) {
			if (commandeUser.gauche) {
	            deplacerSpriteVersLaGauche(vaisseau);
	          }
			
	         if (commandeUser.droite) {
	        	 deplacerSpriteVersLaDroite(vaisseau);
	         }
	         if (commandeUser.tir && !this.aUnMissile()) {
	        	 this.tirerUnMissile(new Dimension(Constante.MISSILE_LONGUEUR,Constante.MISSILE_HAUTEUR),Constante.MISSILE_VITESSE);
	        		        	 
	         }
	         if (this.aUnMissile() && commandeUser !=null) {
	        		this.deplacerMissile();
	        		
	        		if (this.missile.origine.ordonnee()+this.missile.dimension.hauteur()<0) {
	        			this.missile=null;
	        		}
	        	}
	         
	         if (this.aUnEnvahisseur() && commandeUser != null) {
	        	 if(retour) {
	        		 this.envahisseur.deplacerHorizontalementVers(Direction.DROITE);
	        	 }
	        	 else {
	        		 this.envahisseur.deplacerHorizontalementVers(Direction.GAUCHE);
	        	 }
	        	 System.out.println(this.envahisseur.origine.abscisse());
	        	 if (this.envahisseur.origine.abscisse() + this.envahisseur.getDimension().longueur() > this.longueur) {
	        		 retour =false;
	        		 System.out.println("BONJOUR");
	        	 }
	        	 if (this.envahisseur.origine.abscisse()<1) {
	        		 retour = true;
	        		 System.out.println("HOLA");
	        	 }
	         }
		}
		
		@Override
	      public boolean etreFini() {
	         return false; 
	      }
		
		public void tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
			
			   if ((vaisseau.hauteur()+ dimensionMissile.hauteur()) > this.hauteur )
				   throw new MissileException("Pas assez de hauteur libre entre le vaisseau et le haut de l'espace jeu pour tirer le missile");
								
			   this.missile = this.vaisseau.tirerUnMissile(dimensionMissile,vitesseMissile);
	       }
	    
		
		public boolean aUnMissile() {
			return missile!=null;
		}
		
		private boolean aUnMissileQuiOccupeLaPosition(int x, int y) {
			return this.aUnMissile() && missile.occupeLaPosition(x, y);
		}
		
		public Missile recupererUnMissile() {
			return this.missile;
		}
		
		public void deplacerMissile() {
			this.missile.deplacerVerticalementVers(Direction.HAUT_ECRAN);
		}
		
		public boolean aUnEnvahisseur() {
			return envahisseur != null;
		}
		
		public Envahisseur recupererUnEnvahisseur() {
			return this.envahisseur;
		}
		
		
		

}
		
		
	

		
	    

   