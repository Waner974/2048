package metier;

public class Game {
	
	public static boolean win(int [][]grille){
        boolean win = false;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(grille[i][j]==2048){
                    win = true;
                }
            }
        }
        return win;
	}
}
