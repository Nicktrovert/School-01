package HelloWorld.Assignment;

import java.util.Scanner;

public class whileSchleife {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        try {
            System.out.print("Welche Aufgabe möchtest du ausführen? ");
            int Input = Integer.parseInt(scanner.next());
            switch (Input){
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                default:
                    throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("You did something wrong, try again!");
            Run();
        }
    }
    public void Task1(){
        int result = 0;
        int x = 1;
        while (x <= 100){
            result += x;
            x++;
        }
        System.out.printf("Die Summe der Zahlen von 1 bis 100 ist: %s", result);
    }
    public void Task2(){
        while (true){
            System.out.print("Geben Sie eine Zahl ein: ");
            int Input = Integer.parseInt(scanner.next());
            if (Input < 0) break;
            System.out.printf("%s ist %s. \n", Input, Input % 2 == 0 ? "gerade" : "ungerade");
        }
    }
    public void Task3(){
        while (true){
            System.out.print("Geben Sie eine positive Zahl ein: ");
            int Input = Integer.parseInt(scanner.next());
            if (Input < 0) break;
            System.out.printf("Die Umkehrung von %s ist: %s \n", Input, new StringBuilder(String.valueOf(Input)).reverse().toString());
        }
    }
}
