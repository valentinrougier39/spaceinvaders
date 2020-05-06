package fr.unilim.iut.spaceinvaders.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	
	private SpaceInvaders jeu;
	
	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		this.jeu=spaceInvaders;
	}
	
	@Override
	public void dessiner(BufferedImage image) {
		
		if (this.jeu.aUnVaisseau()) {
			   Vaisseau vaisseau = this.jeu.recupererVaisseau();
			   this.dessinerUnVaisseau(vaisseau, image);
		   }
		if (this.jeu.aUnMissile()) {
			Missile missile = this.jeu.recupererUnMissile();
			this.dessinerUnMissile(missile, image);
		}
		
		if (this.jeu.aUnEnvahisseur()) {
			Envahisseur envahisseur = this.jeu.recupererUnEnvahisseur();
			this.dessinerUnEnvahisseur(envahisseur, image);
		}

	}
	
	private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		    Graphics2D crayon = (Graphics2D) im.getGraphics();

		   	crayon.setColor(Color.gray);
		   	crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(), vaisseau.hauteur());

	   }
	
	private void dessinerUnMissile(Missile missile, BufferedImage im) {
		   Graphics2D crayon = (Graphics2D) im.getGraphics();

		   crayon.setColor(Color.blue);
		   crayon.fillRect(missile.origine.x,missile.origine.y,missile.dimension.longueur,missile.dimension.hauteur);
	   }
	
	private void dessinerUnEnvahisseur(Envahisseur envahisseur, BufferedImage im) {
		
		  	Graphics2D crayon = (Graphics2D) im.getGraphics();

		   	crayon.setColor(Color.red);
		   	crayon.fillRect(envahisseur.abscisseLaPlusAGauche(), envahisseur.ordonneeLaPlusBasse(), envahisseur.longueur(), envahisseur.hauteur());
		
	}
	
	/*private void dessinerUnSprite(Sprite sprite, BufferedImage im, Color couleur) {
        Graphics2D crayon = (Graphics2D) im.getGraphics();

        crayon.setColor(couleur);
        crayon.fillRect(sprite.abscisseLaPlusAGauche(), sprite.ordonneeLaPlusBasse(), sprite.getDimension().longueur(), sprite.getDimension().hauteur());
    }
	*/
}
