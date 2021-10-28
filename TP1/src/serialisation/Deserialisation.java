package serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {

	public static void main(String args[]) {
		File fichier =  new File("C:/Apps/data/java/marv.ser");

		try {
			// ouverture d'un flux sur un fichier
			ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier));

			// désérialization de l'objet
			Animal a = (Animal)ois.readObject();

			System.out.println("Animal charge : "+a.getName());
			a.crier();

			// fermeture du flux
			ois.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
