package jeu.modele;

public class Map {

	private int[] carte={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,		
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
						 0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,
						 0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,
						 1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,
						 1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,0,1,1,1,
						 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
						 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
						 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
						 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	
	public Map () {
	}
	public int[] getTab () {
		return this.carte;
	}
}
