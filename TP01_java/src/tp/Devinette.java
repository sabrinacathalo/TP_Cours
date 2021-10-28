package tp;

import java.util.Scanner;

public class Devinette {
	public static void main(String[]  argv) {
		int NB_MIN = (int) (Math.random()*10);
		int NB_MAX = (int) (Math.random()*10)+NB_MIN;
		int NB_A_TROUVER = (int) (Math.random()* (NB_MAX - NB_MIN)) + NB_MIN;
		System.out.println("Entrez votre nombre entre " + NB_MIN + " et "+ NB_MAX + ": " + NB_A_TROUVER);
		 for(int i = 1; i < 10; i++) {	
			 int entier = demande();
			 if (NB_MIN < entier) {
				 System.out.println ("Plus haut");
			 }
			 else if (entier > NB_A_TROUVER) {
				 System.out.println ("Plus bas");
			 }
			 else if (entier == NB_A_TROUVER) {
				 System.out.println ("BRAVO ! Vous avez réussi en " + i + " coups.");
			 }
		 }
	}
	
	public static int demande() {
		Scanner scanner = new Scanner(System.in);
		int entier = scanner.nextInt();
		return entier;
	}
}