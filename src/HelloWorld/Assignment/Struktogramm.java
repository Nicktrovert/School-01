package HelloWorld.Assignment;

import java.util.Scanner;

public class Struktogramm {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        int a = 1;
        int Summe = 0;
        while (a < 5){
            Summe = Summe + a;
            if (a > 3){
                Summe = Summe - 1;
            }
            a = a + 1;
        }
        System.out.println(Summe);
    }
}
