package HelloWorld.Assignment;

import java.util.Scanner;

public class Ratespiel {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            int Input, tries = 0, zahl = (int)(Math.random() * 100);
            do {
                tries++;
                System.out.printf("Gib eine zahl zwischen 0 und 100 ein: ");
                Input = Integer.parseInt(scanner.next());
                System.out.printf("Die gesuchte zahl ist %s...\n", (zahl < Input ? "kleiner" : (zahl > Input ? "größer" : "gleich")));
            } while (zahl != Input);
            System.out.printf("Gesuchte Zahl nach %s Versuchen gefunden (%s)", tries, zahl);
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
