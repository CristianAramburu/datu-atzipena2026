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

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            int count = 1;

            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println(count);
                count += 1;
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