package HelloWorld.Assignment;

import java.util.Scanner;

public class Schleifen {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        try {
            System.out.print("Welche Aufgabe möchtest du ausführen? ");
            int Input = Integer.parseInt(scanner.nextLine());
            switch (Input){
                case 1:
                    Task1();
                    break;
                case 3:
                    Task3b();
                    break;
                case 4:
                    Task4();
                    break;
                case 5:
                    Task5();
                    break;
                case 6:
                    Task6();
                    break;
                case 7:
                    Task7();
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
    public void Task1() throws Exception {
        System.out.print("von a nach b mit s(schrittweite): ");
        String input = scanner.nextLine();
        String[] SplitInput = input.split("[ \\,]+");
        if (SplitInput.length < 3){
            throw new Exception();
        }
        int a = Integer.parseInt(SplitInput[0]);
        int b = Integer.parseInt(SplitInput[1]);
        int s = Integer.parseInt(SplitInput[2]);
        for (int i = a; i <= b; i += s){
            System.out.printf("%s", i);
            if (i != b && !(i + s > b)){
                System.out.print(", ");
            }
        }
    }
    public void Task3b(){
        int total = 0;
        for (int x = 1; x <= 5; x++){
            System.out.println(x*x);
            total = total + (x*x);
        }
        System.out.println("Total ist: " + total);
    }
    public void Task4(){
        System.out.print("1. Zahl: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("2. Zahl: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= b; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= b; i++){
            for (int j = 1; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = a; i > a-b; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Task5(){
        System.out.print("Geben sie die Breite des Rechtecks ein: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.print("Geben sie die Höhe des Rechtecks ein: ");
        int height = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < height; i++){
            System.out.print("*");
            for (int j = 1; j < width-1; j++){
                System.out.printf("%s", i == 0 || i == height-1 ? "*" : " ");
            }
            System.out.print("*\n");
        }
    }
    public void Task6(){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%s x %s = %s\n", j, i, i*j);
            }
        }
    }
    public void Task7(){

    }
}
