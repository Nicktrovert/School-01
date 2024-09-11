package HelloWorld.Assignment;

import java.util.Scanner;

public class ZahlInfo {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        try{
            System.out.print("Gib eine zahl ein: ");
            int Input = scanner.nextInt();
            System.out.printf("Eingegebene zahl ist %s 0 und %s", Input == 0 ? "gleich" : Input < 0 ? "kleiner" : "groesser", Input % 2 == 0 ? "gerade" : "ungerade");
        } catch (Exception e){
            System.out.println("You did something wrong, try again!");
            Run();
        }
    }
}
