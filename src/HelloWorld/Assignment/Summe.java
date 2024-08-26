package HelloWorld.Assignment;

import java.util.Scanner;

public class Summe
{
    public static Scanner scanner = new Scanner(System.in);

    public static void Run(){
        long Num1, Num2;
        double Result;

        System.out.println("Gebe die erste Zahl ein: ");
        Num1 = scanner.nextInt();

        System.out.println("Gebe die zweite Zahl ein: ");
        Num2 = scanner.nextInt();

        Result = (double) Num1 / Num2;

        System.out.printf("Summe von %s / %s ist: %s \n", Num1, Num2, Result);
    }
}
