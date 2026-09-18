package paagbi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
xanadu.txt-tik outagain.txt-ra copiatzen du textua, minuskulaz dauden caractereak maiuskuletara pasatzen du
Ez badu xanadu.txt fitxeroa aurkitzen mezu bat azaltzen du salbuespena try-catch batekin harrapatzen
*/

public class CopyCharactersMaiuskulaz {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("xanadu.txt");
            out = new FileWriter("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                c = Character.toUpperCase(c);
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