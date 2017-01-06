package metier;

public class GrilleMetier {
	 private static void transpose(int[][] m) {
	        for (int i = 0; i < m.length; i++) {
	            for (int j = i; j < m[0].length; j++) {
	                int x = m[i][j];
	                m[i][j] = m[j][i];
	                m[j][i] = x;
	            }
	        }
	    }
	    public static void rotationGauche(int[][] m) {
	        transpose(m);
	        for (int  i = 0; i < m.length/2; i++) {
	            for (int j = 0; j < m[0].length; j++) {
	                int x = m[i][j];
	                m[i][j] = m[m.length -1 -i][j]; 
	                m[m.length -1 -i][j] = x;
	            }
	        }
	    }
	      public static void rotationDroite(int[][] m) {
	        transpose(m);
	        for (int  j = 0; j < m[0].length/2; j++) {
	            for (int i = 0; i < m.length; i++) {
	                int x = m[i][j];
	                m[i][j] = m[i][m[0].length -1 -j]; 
	                m[i][m[0].length -1 -j] = x;
	            }
	        }
	    }
	    public static void decalDroite(int [][]grille){
	        for(int i=0; i<4; i++){
	            if(grille[i][3]==0){
	                if(grille[i][2]==0){
	                    if(grille[i][1]==0){
	                        if(grille[i][0]!=0){
	                            grille[i][3] = grille[i][0];//condition 1
	                            grille[i][0] = 0;
	                        }
	                    }
	                    if(grille[i][1]!=0){
	                        if(grille[i][0]==0){
	                            grille[i][3] = grille[i][1];//condition 2
	                            grille[i][1] = 0;
	                        }
	                        if(grille[i][0]!=0){
	                            grille[i][2] = grille[i][1];//condition 3
	                            grille[i][1] = grille[i][0];
	                            grille[i][0] = 0;
	                        }
	                    }
	                }
	                if(grille[i][2]!=0){
	                    if(grille[i][1]==0){
	                        if(grille[i][0]==0){
	                            grille[i][3] = grille[i][2];//condition 4
	                            grille[i][2] = 0;
	                        }
	                        if(grille[i][0]!=0){
	                            grille[i][3] = grille[i][2];//condition 5
	                            grille[i][2] = grille[i][0];
	                            grille[i][0] = 0;
	                        }
	                    }
	                    if(grille[i][1]!=0){
	                        if(grille[i][0]==0){
	                            grille[i][3] = grille[i][2];//condition 6
	                            grille[i][2] = grille[i][1];
	                            grille[i][1] = 0;
	                        }
	                        if(grille[i][0]!=0){
	                            grille[i][3] = grille[i][2];//condition 7
	                            grille[i][2] = grille[i][1];
	                            grille[i][1] = grille[i][0];
	                            grille[i][0] = 0;
	                        }
	                    }
	                }
	            }
	            if(grille[i][3]!=0){
	                if(grille[i][2]==0){
	                    if(grille[i][1]==0){
	                        if(grille[i][0]!=0){
	                            grille[i][2] = grille[i][0];//condition 9
	                            grille[i][0] = 0;
	                        }
	                    }
	                    if(grille[i][1]!=0){
	                        if(grille[i][0]==0){
	                            grille[i][2] = grille[i][1];//condition 10
	                            grille[i][1] = 0;
	                        }
	                        if(grille[i][0]!=0){
	                            grille[i][2] = grille[i][1];//condition 11
	                            grille[i][1] = grille[i][0];
	                            grille[i][0] = 0;
	                        }
	                    }
	                }
	                if(grille[i][2]!=0){
	                    if(grille[i][1]==0){
	                        if(grille[i][0]==0){
	                            //No need to do anything here at condition 12
	                        }
	                        if(grille[i][0]!=0){
	                            grille[i][1] = grille[i][0];//condition 13
	                            grille[i][0] = 0;
	                        }
	                    }
	                    if(grille[i][1]!=0){
	                        if(grille[i][0]==0){
	                              //No need to do anything here at condition 14
	                        }
	                        if(grille[i][0]!=0){
	                              //No need to do anything here at condition 15
	                        }
	                    }
	                }
	            }
	        } 
	    }
	    
	   
}
