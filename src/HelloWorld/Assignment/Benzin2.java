package HelloWorld.Assignment;

import java.util.Scanner;

public class Benzin2 {
    public Scanner scanner = new Scanner(System.in);

    public void Run(){
        double UsedFuel, AverageConsumptionPer100, DistanceTraveled;

        System.out.println("Gebe den verbrauchten Kraftstoff ein: ");
        UsedFuel = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.println("Gebe die zurückgelegte Strecke in km ein: ");
        DistanceTraveled = Double.parseDouble((scanner.next()).replace(',', '.'));

        if (DistanceTraveled != 0){
            AverageConsumptionPer100 = (UsedFuel / DistanceTraveled) * 100;

            System.out.printf("Durchschnittsverbrauch: %.2f l/100km \n", AverageConsumptionPer100);
        }
        else{
            throw new IllegalArgumentException("Die zurückgelegte Strecke darf nicht null(0) sein.");
        }
    }
}
