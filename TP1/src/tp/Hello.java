package tp;// Nom du package

public class Hello {// Debut de ma classe Hello
	
    public static void main(String args[]){// Methode principale
    	if(args.length>0) {
    		System.out.println("Hello "+args[0]+" !");// Affichage du message
    	}
    	else {
    		System.out.println("Hello world !");// Affichage du message
    	}
	}
    
}// Fin de la classe
