package paagbi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
xanadu.txt-tik outagain.txt-ra copiatzen du textua, "a" letrak "o" batekin ordezkatuz
Ez badu xanadu.txt fitxeroa aurkitzen mezu bat azaltzen du salbuespena try-catch batekin harrapatzen
*/

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("xanadu.txt");
            out = new FileWriter("outagain.txt");

            int c;

            while ((c = in.read()) != -1) {
                if (c == 'a'){
                    c = 'o';
                }
                if (c == 'A'){
                    c = 'O';
                }
                out.write(c);
            }

            System.out.println("Fitxeroa idatzi da");

        } catch (FileNotFoundException fne) {
            System.out.println("Fitxeroa ez da aurkitu :(");

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }

        }
    }
}