package paagbi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
xanadu.txt-tik outagain.txt-ra copiatzen du textua
*/

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("xanadu.txt");
        FileOutputStream out = new FileOutputStream("outagain.txt")){

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("\nFitxategia kopiatu da :)\n");

        } catch (FileNotFoundException fne) {
                System.out.println("\nFitxeroa ez da aurkitu :(\n");
        }
    }
}