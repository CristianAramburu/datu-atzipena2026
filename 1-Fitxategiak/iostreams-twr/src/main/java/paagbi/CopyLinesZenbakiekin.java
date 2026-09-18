package paagbi;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
xanadu.txt-tik outagain.txt-ra copiatzen du textua, minuskulaz dauden caractereak maiuskuletara pasatzen du
Ez badu xanadu.txt fitxeroa aurkitzen mezu bat azaltzen du salbuespena try-catch batekin harrapatzen
*/

public class CopyLinesZenbakiekin {
    public static void main(String[] args) throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader("xanadu.txt"));
            PrintWriter out = new PrintWriter(new FileWriter("outagain.txt"))){
            
            String l;
            int lnumber = 1;
            
            while ((l = in.readLine()) != null) {
                out.println(lnumber + " - " + l);
                lnumber += 1;
            }

            System.out.println("\nFitxeroa idatzi da :)\n");

        } catch (FileNotFoundException fne) {
            System.out.println("\nFitxeroa ez da aurkitu :(\n");

        }
    }
}