package HelloWorld.Assignment;

import java.util.Scanner;

public class Primzahl {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            System.out.printf("Gib eine Ganzzahl ein: ");
            long Input = Long.parseLong(scanner.next());
            System.out.printf("%s ist %seine Primzahl", Input, IsPrime(Input) ? "" : "k");
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }

    public boolean IsPrime(long num){
        if (num == 2 || num < 1) return false;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
