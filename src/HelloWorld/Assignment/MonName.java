package HelloWorld.Assignment;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class MonName {
    public Scanner scanner = new Scanner(System.in);

    //V.2 --- With DateFormatSymbols:
    public void Run(){
        try {
            //get the number of the month
            System.out.print("Bitte gib die Nummer des Monats ein (1..12): ");
            int UInput = Integer.parseInt(scanner.next());

            //check if number is within the valid range
            if (UInput > 12) throw new IllegalArgumentException();

            //get month in string format from number
            String monthString = new DateFormatSymbols().getMonths()[UInput - 1];

            //output the month to the console
            System.out.printf("\nDer %s. Monat heißt %s.\n", UInput, monthString);
        } catch (Exception e){
            //Repeat everything if something goes wrong
            System.out.println("You did something wrong. Try again!\n");
            Run();
        }
    }

    /*V.1 --- With switch statement:

    public void Run(){
        try {
            //get the number of the month
            System.out.print("Bitte gib die Nummer des Monats ein (1..12): ");
            int UInput = Integer.parseInt(scanner.next());

            //get month in string format from number
            String monthString = GetMonth(UInput);

            //output the month to the console
            System.out.printf("\nDer %s. Monat heißt %s.\n", UInput, monthString);
        } catch (Exception e){
            //Repeat everything if something goes wrong
            System.out.println("You did something wrong. Try again!\n");
            Run();
        }
    }

    private String GetMonth(int MonthNumber){
        return switch (MonthNumber){
            case 1 -> "Januar";
            case 2 -> "Februar";
            case 3 -> "März";
            case 4 -> "April";
            case 5 -> "Mai";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "Novemnber";
            case 12 -> "Dezember";
            default -> throw new IllegalStateException("Unexpected value: " + MonthNumber);
        };
    }*/

}
