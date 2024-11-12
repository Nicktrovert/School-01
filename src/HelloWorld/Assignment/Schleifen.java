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
                    Task3();
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
    public void Task3(){

    }
    public void Task4(){

    }
    public void Task5(){

    }
    public void Task6(){

    }
    public void Task7(){

    }
}
