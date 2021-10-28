package tp.fichiers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FichierJavaIO {

	public static void main(String args[]) {

		String fileName="C:/Apps/data/Java/affiche.jpg";
		String url="https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aA1eZtISZ2rqUk2QIUgu1pXcHrm.jpg";

		int connectTimeout=100;
		int readTimeout=100;

		/*Files.copyURLToFile(
				  new URL(url), 
				  new File(fileName), 
				  connectTimeout, 
				  readTimeout);
		*/
	}
}
