package HelloWorld.Assignment;

import java.util.Scanner;

public class Benzin {

    public Scanner scanner = new Scanner(System.in);

    public void Run(){
        double UsedFuel, AverageConsumptionPer100, DistanceTraveled;

        System.out.println("Gebe den verbrauchten Kraftstoff ein: ");
        UsedFuel = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.println("Gebe die zurückgelegte Strecke in km ein: ");
        DistanceTraveled = Double.parseDouble((scanner.next()).replace(',', '.'));

        AverageConsumptionPer100 = (UsedFuel / DistanceTraveled) * 100;

        System.out.printf("Durchschnittsverbrauch: %.2f l/100km \n", AverageConsumptionPer100);
    }
}
