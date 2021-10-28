package wallpapers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Scrapper extends Thread {

	public static String listeFichiersFilename="C:/Apps/data/Java/liste.txt";
	public static String dossierSortieFolder="C:/Apps/data/Java/posters/";
	public static ArrayList<String> listeFichiers;
	public static int cptFile=0;
	public static long fileSize=0;
	public static final int NB_THREAD=4;

	public static void main(String args[]) {		
		long startTime = System.currentTimeMillis();

		System.out.println("Debut du programme");

		Scrapper s = new Scrapper();

		s.chargerFichierConf();
		s.paralleliser();

		long endTime = System.currentTimeMillis();
		DecimalFormat df = new DecimalFormat("#.##");

		// Affichage des compteurs
		System.out.println("Fin du programme");
		System.out.println(cptFile+" fichiers telecharges");
		System.out.println(df.format(fileSize/1024.0/1024.0) +" Mo telecharges");
		System.out.println("En " + (endTime - startTime)/1000.0 + " s");
	}

	private void paralleliser() {
		Scrapper thread[] = new Scrapper[NB_THREAD];

		// Lancement des threads
		for(int i=0; i<NB_THREAD; i++) {
			thread[i] = new Scrapper();
			thread[i].start();
		}

		// Attente de la fin de tous les fils
		for(int i=0; i<NB_THREAD; i++) {
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void chargerFichierConf() {
		try {
			listeFichiers = (ArrayList<String>) Files.readAllLines(Paths.get(listeFichiersFilename));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void telechargerFichier(String url) {
		String fileName = dossierSortieFolder + url.substring( url.lastIndexOf('/')+1, url.length() );
		listeFichiers.remove(0);
		
		try {
			InputStream in = new URL(url).openStream();
			Files.copy(in, Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING);
			fileSize+=Files.size(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run()  
	{    
		System.out.println(Thread.currentThread().getName() +" - Debut du thread");    
		
		while(!listeFichiers.isEmpty()) {
			//Récupération du prochain fichier de la file
			String url = listeFichiers.get(0);
			System.out.println(Thread.currentThread().getName() +" - Début du téléchargement de : "+url);
			telechargerFichier(url);
			System.out.println(Thread.currentThread().getName() +" - Fin du téléchargement de : "+url);

			cptFile++;
		}
		
		System.out.println(Thread.currentThread().getName() +" - Fin du thread");    
	} 
}
