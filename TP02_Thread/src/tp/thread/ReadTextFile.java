package tp.thread;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class ReadTextFile
{
    public static void main (String[] args) throws IOException
        {
            BufferedReader in = new BufferedReader(new FileReader("B:\test.txt"));
            String line;
            while ((line = in.readLine()) != null)
            {
                 System.out.println (line);
            }
            in.close();
 
        }
}