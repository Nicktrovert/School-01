package HelloWorld.Assignment;

import java.util.Scanner;

public class Kehrwert {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        try {
            System.out.print("gib eine zahl ein: ");
            int Input = scanner.nextInt();
            if (Input != 0){
                System.out.printf("\nKehrwert der zahl: %.2f\n", ((float)1 / (float)Input));
            } else{
                System.out.println("Kehrwert aus 0 kann nicht gebildet werden.");
            }
        }
        catch (Exception e){
            System.out.println("You did something wrong, try again!");
            Run();
        }
    }
}
