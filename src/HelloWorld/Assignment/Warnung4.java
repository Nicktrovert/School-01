package HelloWorld.Assignment;

import java.util.Scanner;

public class Warnung4 {
    public Scanner scanner = new Scanner(System.in);
    public void Run(){
        final long grenzWert = 50;
        System.out.printf("gib eine zahl kleiner als %s ein: ", grenzWert+1);
        double Input = scanner.nextLong();

        if (Input <= grenzWert){
            System.out.println("Alles ist OK!");
        }
        else{
            System.err.printf("\nDie zahl ist größer als %s!\n", grenzWert);
        }
    }
}
