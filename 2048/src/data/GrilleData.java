package data;

import java.util.Random;

public class GrilleData {
	
	
	 public static int caseLibre(int [][]grille){
	        int caseLibre = 0;
	        for(int i=0; i<4; i++){
	            for(int j=0; j<4; j++){
	                if(grille[i][j]==0){
	                    caseLibre++;
	                }
	            }
	        }
	        return caseLibre;}
	 
	    public static void genNombre(int [][]grille){
	        boolean check = true;
	        int []rnd = new int[3];
	        rnd[0] = 2;
	        rnd[1] = 4;
	        rnd[2] = 8;
	        Random randomGen = new Random();
	        int rint;
	        int rint2;
	        while(check){
	            rint = randomGen.nextInt(4);
	            rint2 = randomGen.nextInt(4);
	            if(grille[rint][rint2]==0){
	                grille[rint][rint2]=rnd[randomGen.nextInt(rnd.length)];
	                check = false;
	            }
	        }
	    }
	    }

