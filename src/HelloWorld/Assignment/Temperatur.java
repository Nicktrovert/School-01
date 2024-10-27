package HelloWorld.Assignment;

import HelloWorld.Data.Temperature;

import java.util.Scanner;

public class Temperatur {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        System.out.print("gib eine °C Temperatur ein: ");
        String input = scanner.next();

        try{
            Double.parseDouble(input.substring(input.length() - 2));
            input += "°C";
        }
        catch (NumberFormatException ignored){
            //input is good
        }
        catch (Exception e) {
            System.out.println("\n\n\n\n\n\n\n\n\nDu hast etwas falsches eingegeben.\n");
            Run();
            return;
        }

        Temperature Temp = Temperature.Parse(input);

        //diese variablen existieren weil aufgabe diese haben will.
        double celsius = Temp.GetCelsius();
        double fahrenheit =  Temp.GetFahrenheit();

        System.out.printf("\n%.2f Grad Celsius sind %.2f Grad Fahrenheit", celsius, fahrenheit);
    }
}
