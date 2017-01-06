package presentation;

public class GrillePres {
    static void rendu(int [][]myTab){
	       System.out.println("+---+---+---+---+");
	       System.out.print("| ");
	       affGrille(myTab[0][0]);
	       System.out.print(" | ");
	       affGrille(myTab[0][1]);
	       System.out.print(" | ");
	       affGrille(myTab[0][2]);
	       System.out.print(" | ");
	       affGrille(myTab[0][3]);
	       System.out.println(" |");
	       System.out.println("+---+---+---+---+");
	       System.out.print("| ");
	       affGrille(myTab[1][0]);
	       System.out.print(" | ");
	       affGrille(myTab[1][1]);
	       System.out.print(" | ");
	       affGrille(myTab[1][2]);
	       System.out.print(" | ");
	       affGrille(myTab[1][3]);
	       System.out.println(" |");
	       System.out.println("+---+---+---+---+");
	       System.out.print("| ");
	       affGrille(myTab[2][0]);
	       System.out.print(" | ");
	       affGrille(myTab[2][1]);
	       System.out.print(" | ");
	       affGrille(myTab[2][2]);
	       System.out.print(" | ");
	       affGrille(myTab[2][3]);
	       System.out.println(" |");
	       System.out.println("+---+---+---+---+");
	       System.out.print("| ");
	       affGrille(myTab[3][0]);
	       System.out.print(" | ");
	       affGrille(myTab[3][1]);
	       System.out.print(" | ");
	       affGrille(myTab[3][2]);
	       System.out.print(" | ");
	       affGrille(myTab[3][3]);
	       System.out.println(" |");
	       System.out.println("+---+---+---+---+");
	    }
    
    
	static void affGrille(int x){
	    char c;
	    if(x==0){
	    System.out.print(" ");
	    }
	    else{
	    System.out.print(x);
	    }
	    }
	
	
	   public static void comm()
	{
	    for( int i = 0; i < 25; i++ ) {
	        System.out.println("");
	    }
	    System.out.println("Appuyer sur z pour haut, s pour bas, q pour gauche et d pour droite");
	    System.out.println("Entrer x pour quitter le jeu");
	} 
	   
	   
		   
	    	

	    	
	    } 



