package HelloWorld.Assignment;

import java.util.Scanner;

public class Rechnung {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            double TotalPriceSum = 0, Discount = 0, EndSum = 0;
            System.out.print("Bitte geben sie die anzahl an Artikeln ein: ");
            int NumberOfArticles = Integer.parseInt(scanner.next());
            for (int i = 0; i < NumberOfArticles; i++){
                System.out.printf("\nArtikel %s:\n", i+1);
                System.out.print("  Preis pro Stück: ");
                double PricePerUnit = Double.parseDouble((scanner.next()).replace(',', '.'));
                System.out.print("  Anzahl: ");
                int Amount = scanner.nextInt();

                TotalPriceSum += PricePerUnit * Amount;
            }

            if (TotalPriceSum > 100){
                Discount = TotalPriceSum * 0.1;
            }

            EndSum = (TotalPriceSum - Discount) * 1.19;

            System.out.printf("\nGesamtpreis (ohne MwSt. und Rabatt): %.2f€\n" +
                    "Rabatt: %.2f€\n" +
                    "Endpreis (inkl. MwSt.): %.2f€", TotalPriceSum, Discount, EndSum);
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
