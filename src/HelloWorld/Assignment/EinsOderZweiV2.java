package HelloWorld.Assignment;

import java.util.Scanner;

public class EinsOderZweiV2 {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            int Input;
            do {
                System.out.print("Wählen sie 1 oder 2: ");
                Input = Integer.parseInt(scanner.next());
                if (Input != 1 && Input != 2){
                    System.out.print("Fehleingabe!\n");
                }
            } while (Input != 1 && Input != 2);
            System.out.printf("Sie haben \"%s\" gewählt!", Input);
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
