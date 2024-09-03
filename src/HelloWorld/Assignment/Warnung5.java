package HelloWorld.Assignment;

import java.util.Scanner;

public class Warnung5 {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        final long grenzWert = 50;
        long anzahlFehler = 0;

        while (true){
            System.out.printf("\ngib eine zahl kleiner als %s ein: ", grenzWert);
            double Input = scanner.nextLong();

            if (Input < grenzWert){
                System.out.println("Alles ist OK!");
                break;
            }
            else{
                anzahlFehler++;
                System.err.printf("\nDie eingabe ist größer als %s!\nFehler: %s\n", grenzWert-1, anzahlFehler);
            }
        }
    }
}
