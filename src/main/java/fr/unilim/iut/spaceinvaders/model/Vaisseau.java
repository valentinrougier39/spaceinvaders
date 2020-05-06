package fr.unilim.iut.spaceinvaders.model;

import fr.unilim.iut.spaceinvaders.utils.*;

public class Vaisseau extends Sprite {


	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
	}
	
	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
        
        if (dimensionMissile.longueur > this.dimension.longueur)
            throw new MissileException ("Probleme missile");
            
           Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);

           return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
       }

    
    
	private Position positionOrigineMissile(int abscisseOrigineMissile, int ordonneeeOrigineMissile) {
		return new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
	}

	private int ordonneeOrigineMissile() {
		return this.ordonneeLaPlusBasse() - 1;
	}

	private int abscisseOrigineMissile(Dimension dimensionMissile, int abscisseMilieuVaisseau) {
		return abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);
	}

	private int abscisseMilieuVaisseau() {
		return this.abscisseLaPlusAGauche() + (this.longueur() / 2);
	}
	
	public Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		int abscisseMilieuVaisseau = abscisseMilieuVaisseau();
		int abscisseOrigineMissile = abscisseOrigineMissile(dimensionMissile, abscisseMilieuVaisseau);

		int ordonneeeOrigineMissile = ordonneeOrigineMissile();
		Position positionOrigineMissile = positionOrigineMissile(abscisseOrigineMissile, ordonneeeOrigineMissile);
		
		return positionOrigineMissile;
		
	}
	
	
}
