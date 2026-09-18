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

        try (FileReader in = new FileReader("xanadu.txt");
            FileWriter out = new FileWriter("outagain.txt")){
            
            int c;

            while ((c = in.read()) != -1) {
                c = Character.toUpperCase(c);
                out.write(c);
            }

            System.out.println("\nFitxeroa idatzi da :)\n");

        } catch (FileNotFoundException fne) {
            System.out.println("\nFitxeroa ez da aurkitu :(\n");

        }
    }
}