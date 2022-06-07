package jeu.modele;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;

public class HitBox {
	
	//Variables
	private int xtileDroitePlacer;
	private int xtileGauchePlacer;
	private int ytile;
	private int prochaineTuileDroitePlacer;
	private int prochaineTuileGauchePlacer;	
	private int xtileDroite;
	private int xtileGauche;
	private int prochaineTuileDroite;
	private int prochaineTuileGauche;	
	private int valTabDroite;
	private int valTabGauche;
	private TilePane c;
	private int[] map;
	private Joueur joueur;
	
	//Construceur
	public HitBox(Joueur joueur, TilePane carte, int[] tabMap) {
		this.c = carte;
		this.map = tabMap;
		this.joueur = joueur;
		this.ytile = (joueur.getY()+20)/40;
		
		this.xtileDroitePlacer = ((joueur.getX()+79)/40);
		this.prochaineTuileDroitePlacer =  (xtileDroitePlacer+(ytile*20));
		this.valTabDroite = tabMap[prochaineTuileDroitePlacer];
		
		this.xtileGauchePlacer = ((joueur.getX()-40)/40);
		this.prochaineTuileGauchePlacer =  (xtileGauchePlacer+(ytile*20));
		this.valTabGauche = tabMap[prochaineTuileGauchePlacer];
		
		this.xtileDroite = ((joueur.getX()+40)/40);
		this.prochaineTuileDroite =  (xtileDroite+(ytile*20));
		
		this.xtileGauche = ((joueur.getX()-1)/40);
		this.prochaineTuileGauche =  (xtileGauche+(ytile*20));
	}
	
	//DROITE
	public boolean peutPlacerDroite() {
		if(joueur.getInventaireResource().get(0).getResource().getValue() > 0  && !joueur.getSaute() )
			return (valTabDroite!=1 && valTabDroite!=2 && valTabDroite!=3 && valTabDroite!=4 && valTabDroite!=5 && valTabDroite!=6 && valTabDroite!=7);
		return false;
	}
	public boolean peutCasserDroite() {
		return (valTabDroite!=0 && valTabDroite!=1 && valTabDroite!=2 && valTabDroite!=3 && valTabDroite!=7);
	}
	public void placerTuileDroite() {
		c.getChildren().remove(this.prochaineTuileDroitePlacer);
		map[this.prochaineTuileDroitePlacer] = 4;
		c.getChildren().add(this.prochaineTuileDroitePlacer,new ImageView(new Image("jeu/modele/image/map/bois.png")) );
		joueur.getInventaireResource().get(0).retirerResource();
	}
	public void casserTuileDroite() {
		c.getChildren().remove(this.prochaineTuileDroite);
		map[this.prochaineTuileDroite] = 0;
		c.getChildren().add(this.prochaineTuileDroite,new ImageView(new Image("jeu/modele/image/map/ciel.png")) );
		joueur.getInventaireResource().get(0).ajouterResource();
	}
	
	//GAUCHE
	public boolean peutPlacerGauche() {
		if(joueur.getInventaireResource().get(0).getResource().getValue() > 0 && !joueur.getSaute())
			return (valTabGauche!=1 && valTabGauche!=2 && valTabGauche!=3 && valTabGauche!=4 && valTabGauche!=5 && valTabGauche!=6 && valTabGauche!=7);
		return false;
	}
	public boolean peutCasserGauche() {
		return (valTabGauche!=0 && valTabGauche!=1 && valTabGauche!=2 && valTabGauche!=3 && valTabGauche!=7);
	}
	public void placerTuileGauche() {
		c.getChildren().remove(this.prochaineTuileGauchePlacer);
		map[this.prochaineTuileGauchePlacer] = 4;
		c.getChildren().add(this.prochaineTuileGauchePlacer,new ImageView(new Image("jeu/modele/image/map/bois.png")) );
		joueur.getInventaireResource().get(0).retirerResource();
	}
	public void casserTuileGauche() {
		c.getChildren().remove(this.prochaineTuileGauche);
		map[this.prochaineTuileGauche] = 0;
		c.getChildren().add(this.prochaineTuileGauche,new ImageView(new Image("jeu/modele/image/map/ciel.png")) );
		joueur.getInventaireResource().get(0).ajouterResource();
	}
	
	//Getters
	public int getXtileDroite() {
		return xtileDroitePlacer;
	}
	public int getXtileGauche() {
		return xtileGauchePlacer;
	}
	public int getYtile() {
		return ytile;
	}
	public int getProchaineTuileDroite() {
		return prochaineTuileDroitePlacer;
	}
	public int getProchaineTuileGauche() {
		return prochaineTuileGauchePlacer;
	}
	public int getValTabDroite() {
		return valTabDroite;
	}
	public int getValTabGauche() {
		return valTabGauche;
	}
	public TilePane getC() {
		return c;
	}
	public int[] getMap() {
		return map;
	}
	
	
	//Setters
	public void setXtileDroitePlacer(int xtileDroite) {
		this.xtileDroitePlacer = xtileDroite;
	}
	public void setXtileGauchePlacer(int xtileGauche) {
		this.xtileGauchePlacer = xtileGauche;
	}
	public void setYtile(int ytile) {
		this.ytile = ytile;
	}
	public void setProchaineTuileDroitePlacer(int prochaineTuileDroite) {
		this.prochaineTuileDroitePlacer = prochaineTuileDroite;
	}
	public void setProchaineTuileGauchePlacer(int prochaineTuileGauche) {
		this.prochaineTuileGauchePlacer = prochaineTuileGauche;
	}
	public void setValTabDroite(int valTabDroite) {
		this.valTabDroite = valTabDroite;
	}
	public void setValTabGauche(int valTabGauche) {
		this.valTabGauche = valTabGauche;
	}
	public void setC(TilePane c) {
		this.c = c;
	}
	public void setMap(int[] map) {
		this.map = map;
	}
}
