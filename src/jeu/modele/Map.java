package jeu.modele;

import javafx.scene.image.Image;

public class Map {

	//0 ciel
	//1 terre
	//2 sol avec herbes
	//3 obsidennes
	//4 bois
	//5 metal
	//6 pierre
	//7 haut de la map
	private int[] carte={7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,		
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,3,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,
						 2,0,0,0,0,0,4,0,0,2,1,2,0,0,4,0,0,0,0,0,
						 1,2,2,2,2,2,2,2,2,1,1,1,2,2,2,0,0,4,2,2,
						 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,1,1,
						 3,3,3,1,1,1,1,3,1,1,1,3,3,3,3,3,3,3,3,1,
						 3,3,3,3,1,1,3,3,3,3,3,3,3,3,3,3,3,3,3,1,
						 3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,};
	
	public Map () {
	}
	public int[] getTab () {
		return this.carte;
	}
}
