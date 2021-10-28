package serialisation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation {

	public static void main(String args[]) {
		File fichier =  new File("C:/Apps/data/java/marv.ser") ;

		try {
			// ouverture d'un flux sur un fichier
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fichier));

			// cr�ation d'un objet � s�rializer
			Animal a =  new Animal("Marv",  0);

			// s�rialization de l'objet
			oos.writeObject(a);

			// fermeture du flux
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
