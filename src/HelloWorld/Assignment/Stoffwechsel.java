package HelloWorld.Assignment;

import java.util.Scanner;

public class Stoffwechsel {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        double Weight, Height, Age;

        System.out.print("Gib das Gewicht an in [kg]: ");
        Weight = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.print("Gib die Höhe an in [cm]: ");
        Height = Double.parseDouble((scanner.next()).replace(',', '.'));

        System.out.print("Gib das Alter an: ");
        Age = scanner.nextInt();

        System.out.printf("Mann: %.2f Kalorien pro Tag.\n", MaleCalc(Weight, Height, Age));
        System.out.printf("Frau: %.2f Kalorien pro Tag.\n", FemaleCalc(Weight, Height, Age));

    }

    public static double MaleCalc(double _Weight, double _Height, double _Age){
        return 66.47 + 13.7 * _Weight + 5 * _Height - 6.8 * _Age;
    }

    public static double FemaleCalc(double _Weight, double _Height, double _Age){
        return 655.1 + 9.6 * _Weight + 1.8 * _Height - 4.7 * _Age;
    }
}
