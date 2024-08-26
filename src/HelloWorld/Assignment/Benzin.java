package HelloWorld.Assignment;

import java.util.Scanner;

public class Benzin {

    public static Scanner scanner = new Scanner(System.in);

    public static void Run(){
        double UsedFuel, AverageConsumptionPer100, DistanceTraveled;

        System.out.println("Gebe den verbrauchten Kraftstoff ein: ");
        UsedFuel = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.println("Gebe die zurückgelegte Strecke in km ein: ");
        DistanceTraveled = Double.parseDouble((scanner.next()).replace(',', '.'));

        AverageConsumptionPer100 = (UsedFuel / DistanceTraveled) * 100;

        System.out.printf("Durchschnittsverbrauch: %s l/100km \n", String.format("%.2f", AverageConsumptionPer100));
    }
}
