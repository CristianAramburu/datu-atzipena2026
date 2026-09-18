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

        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader("xanadu.txt"));
            out = new PrintWriter(new FileWriter("outagain.txt"));
            String l;
            int lnumber = 1;
            while ((l = in.readLine()) != null) {
                out.println(lnumber + " - " + l);
                lnumber += 1;
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