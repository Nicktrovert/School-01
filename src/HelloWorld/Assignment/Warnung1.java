package HelloWorld.Assignment;

import java.util.Scanner;

public class Warnung1 {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        System.out.print("gib eine zahl zwischen 1 und 10 ein: ");
        double Input = scanner.nextLong();

        if (Input > 10 || Input < 1){
            System.err.println("Die zahl befindet sich nicht zwischen 1 und 10!");
        }
    }
}
