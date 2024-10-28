package HelloWorld.Assignment;

import java.util.Scanner;

public class einsoderzwei {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            System.out.printf("Wählen sie 1 oder 2: ");
            int Input = Integer.parseInt(scanner.next());
            while (Input != 1 && Input != 2){
                System.out.printf("Fehleingabe!\nWählen sie 1 oder 2: ");
                Input = Integer.parseInt(scanner.next());
            }
            System.out.printf("Sie haben \"%s\" gewählt!", Input);
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
