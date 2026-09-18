package paagbi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
xanadu.txt-tik outagain.txt-ra copiatzen du textua
Ez badu xanadu.txt fitxeroa aurkitzen mezu bat azaltzen du salbuespena try-catch batekin harrapatzen
*/

public class CopyBytesFNEKontrolatuz {
    public static void main(String[] args) throws IOException {


        try (FileInputStream in = new FileInputStream("xanadu.txt");
        FileOutputStream out = new FileOutputStream("outagain.txt")) {
            int c;
            int count = 1;

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println(count);
                count += 1;
            }  

            System.out.println("\nFitxeroa idatzi da :)\n");

        } catch (FileNotFoundException fne) {
            System.out.println("\nFitxeroa ez da aurkitu :(\n");

        }
    }
}