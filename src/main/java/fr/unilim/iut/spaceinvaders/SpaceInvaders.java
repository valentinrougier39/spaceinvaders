package fr.unilim.iut.spaceinvaders;
import fr.unilim.iut.spaceinvaders.utils.*;

public class SpaceInvaders {

	    private static final char MARQUE_FIN_LIGNE = '\n';
		private static final char MARQUE_VIDE = '.';
		private static final char MARQUE_VAISSEAU = 'V';
		int longueur;
	    int hauteur;
	    Vaisseau vaisseau;
	    
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
				espaceDeJeu.append(MARQUE_FIN_LIGNE);
			}
			return espaceDeJeu.toString();
		}
	    
	    public void initialiserJeu() {
			Position positionVaisseau = new Position(this.longueur/2,this.hauteur-1);
			Dimension dimensionVaisseau = new Dimension(Constante.VAISSEAU_LONGUEUR, Constante.VAISSEAU_HAUTEUR);
			positionnerUnNouveauVaisseau(dimensionVaisseau, positionVaisseau, Constante.VAISSEAU_VITESSE);
		 }
	    
	    public void deplacerVaisseauVersLaDroite() {
			if (vaisseau.abscisseLaPlusADroite() < (longueur - 1)) {
				vaisseau.seDeplacerVersLaDroite();
				if (!estDansEspaceJeu(vaisseau.abscisseLaPlusADroite(), vaisseau.ordonneeLaPlusHaute())) {
					vaisseau.positionner(longueur - vaisseau.dimension.longueur, vaisseau.ordonneeLaPlusHaute());
				}
			}
		}
		
	    public void deplacerVaisseauVersLaGauche() {
			if (0 < vaisseau.abscisseLaPlusAGauche())
				vaisseau.seDeplacerVersLaGauche();
			if (!estDansEspaceJeu(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusHaute())) {
				vaisseau.positionner(0, vaisseau.ordonneeLaPlusHaute());
			}
		}

		private boolean estDansEspaceJeu(int x, int y) {
			return ((x >= 0) && (x < longueur)) && ((y >= 0) && (y < hauteur));
		}
	    
		private boolean aUnVaisseau() {
			return vaisseau!=null;
		}	
		
		private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {
			return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);
		}

		private char recupererMarqueDeLaPosition(int x, int y) {
			char marque;	 
			if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
				marque=MARQUE_VAISSEAU;
			else
				marque=MARQUE_VIDE;
			return marque;
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

}
		
		
	

		
	    

   