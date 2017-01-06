package presentation;
import metier.GrilleMetier;
import java.util.Scanner;

public class Affichage {
	
public static void instruc(){
		System.out.println("Good Game ! ");
        System.out.println("z = haut - s = bas | q = gauche | d =droite→");
        System.out.println("Appuyer sur x pour quitter le jeu");
}

public static void menu ()
{
	int [][]grille = new int[4][4];
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            grille[i][j] = 0;

        }
    }

    grille[1][2]=2;
    grille[0][0]=2;
    presentation.GrillePres.rendu(grille);

    Scanner in = new Scanner(System.in);
    char c = 'y';
    int caseLibre = 0;
    
    
    while(c!='x'){
    c = in.next(".").charAt(0);
    
    switch(c){
        case 'z':
            metier.GrilleMetier.rotationDroite(grille);
            add(grille);
            metier.GrilleMetier.rotationGauche(grille);
            presentation.GrillePres.rendu(grille);
            break;
        case 's':
        	metier.GrilleMetier.rotationGauche(grille);
        	add(grille);
            metier.GrilleMetier.rotationDroite(grille);
            presentation.GrillePres.rendu(grille);
            break;
        case 'd':
        	add(grille);
            presentation.GrillePres.rendu(grille);
            break;
        case 'q':
        	metier.GrilleMetier.rotationDroite(grille);
        	metier.GrilleMetier.rotationDroite(grille);
        	add(grille);
            metier.GrilleMetier.rotationGauche(grille);
            metier.GrilleMetier.rotationGauche(grille);
            presentation.GrillePres.rendu(grille);
            break;
    }

    caseLibre =data.GrilleData.caseLibre(grille) ;}
    
    if(metier.Game.win(grille)){
        System.out.println("BRAVO! Vous avez gagné !");
        c = 'x';
    }

else if(caseLibre==0){
        System.out.println("Vous avez perdu ! ");
        c = 'x';
     }
}


public static void add(int [][]grille){
    presentation.GrillePres.comm();
    for(int i=3; i>-1; i--){
    
        if((grille[i][3]==grille[i][2])&&grille[i][3]!=0){
            grille[i][3] = grille[i][3] + grille[i][2];
            grille[i][2] = 0;
        }
        if((grille[i][2]==grille[i][1])&&grille[i][2]!=0){
            grille[i][2] = grille[i][2] + grille[i][1];
            grille[i][1] = 0;
        }
        if((grille[i][1]==grille[i][0])&&grille[i][1]!=0){
            grille[i][1] = grille[i][1] + grille[i][0];
            grille[i][0] = 0;
        }
        if((grille[i][0]==grille[i][2])&&(grille[i][2]!=0)&&(grille[i][1]==0)){
            grille[i][2] = grille[i][2] + grille[i][0];
            grille[i][0] = 0;
        }
        if((grille[i][1]==grille[i][3])&&(grille[i][3]!=0)&&(grille[i][2]==0)){
            grille[i][3] = grille[i][2] + grille[i][1];
            grille[i][1] = 0;
        }
        if((grille[i][0]==grille[i][3])&&(grille[i][3]!=0)&&(grille[i][1]==0)&&(grille[i][2]==0)){
            grille[i][3] = grille[i][3] + grille[i][0];
            grille[i][0] = 0;
        }
    }
    metier.GrilleMetier.decalDroite(grille);
    data.GrilleData.genNombre(grille);
    }

public static void main(){
	instruc();
	menu();
}

}
 

    