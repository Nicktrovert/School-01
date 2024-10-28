package HelloWorld.Assignment;

import java.util.Scanner;

public class Sterne {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            for(int i = 0; i < 20; i++){
                System.out.println("*");
            }
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
