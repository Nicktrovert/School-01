package HelloWorld.Assignment;

import java.util.Scanner;

public class Bestell2 {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        System.out.print("Gib die Auftragssumme ein: ");
        double OrderSum = scanner.nextDouble();

        if (OrderSum < 100){
            OrderSum += 5.50f;
        }
        else if (OrderSum < 200){
            OrderSum += 3;
        }

        System.out.printf("\nDer Rechnungsbetrag beträgt %.2f€\n", OrderSum);
    }
}
