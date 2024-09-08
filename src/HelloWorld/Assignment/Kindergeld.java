package HelloWorld.Assignment;

import java.util.Scanner;

public class Kindergeld {
    private final Scanner scanner = new Scanner(System.in);

    public void Run(){
        long Kinderanzahl;
        double Einkommen, Kindergeld = 0;

        System.out.print("Bitte gib dein Jahreseinkommen ein: ");
        Einkommen = scanner.nextDouble();

        Double[] childToMoneyConversion;
        if (Einkommen < 45000){
            childToMoneyConversion = new Double[] {70.00, 130.00, 220.00, 240.00};
        }
        else{
            childToMoneyConversion = new Double[] {70.00, 70.00, 140.00, 140.00};
        }

        System.out.print("Bitte gib die Anzahl deiner Kinder an: ");
        Kinderanzahl = scanner.nextLong();

        for (int i = 0; i < Kinderanzahl; i++){
            if (i < childToMoneyConversion.length){
                Kindergeld += childToMoneyConversion[i];
            }
            else{
                Kindergeld += childToMoneyConversion[childToMoneyConversion.length-1];
            }
        }

        System.out.printf("\nErgebnis: %.02f D$ Kindergeld!", Kindergeld);
    }
}
