package HelloWorld.Assignment;

import java.util.Scanner;

public class Matrix {
    public Scanner scanner = new Scanner(System.in);
    public void Run() {
        try {
            System.out.println("Matrix von 0 .. 99");
            System.out.print("Zahl (2..9): ");
            int Input = Integer.parseInt(scanner.next());

            if (Input < 2 || Input > 9){
                throw new Exception();
            }

            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++){
                    int NumInMatrix = (j + (10 * i));
                    if ((NumInMatrix % Input == 0 && NumInMatrix != 0) || Integer.toString(NumInMatrix).contains(Integer.toString(Input))){
                        System.out.print("*");
                        for (int x = 0; x < 3; x++){
                            System.out.print(" ");
                        }
                    }
                    else{
                        System.out.print(NumInMatrix);
                        for (int x = 0; x < (i == 0 ? 3 : 2); x++){
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
        catch (Exception e){
            System.out.println("\nDu hast etwas falsch gemacht. Versuche es nochmal.\n");
            Run();
            return;
        }
    }
}
