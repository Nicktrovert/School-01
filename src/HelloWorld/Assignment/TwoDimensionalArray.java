package HelloWorld.Assignment;

import HelloWorld.Data.Stundenplan.Stundenplan;
import HelloWorld.Data.Stundenplan.Subject;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
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
                case 2:
                    Task2();
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
    public void PrintBoard(int[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.printf("%s  ", board[i][j]);
            }
            System.out.println();
        }
    }
    public void Task1() {
        int[][] chessboard = new int[8][8];

        int[][] changedFields = new int[4][3];

        for(int x = 0; x < 4; x++){
            PrintBoard(chessboard);

            System.out.print("\nGib das feld ein, dass du ändern möchtest!");
            System.out.print("\ncolumn: ");
            int col = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.print("row: ");
            int row = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.print("number to set to: ");
            int numberToChangeTo = Integer.parseInt(scanner.nextLine());
            chessboard[col][row] = numberToChangeTo;
            changedFields[x][0] = col;
            changedFields[x][1] = row;
            changedFields[x][2] = numberToChangeTo;
        }
        PrintBoard(chessboard);

        System.out.println("You changed the following fields:");
        for (int i = 0; i < changedFields.length; i++){
            System.out.printf("\n%s:%s=%s", changedFields[i][0], changedFields[i][1], changedFields[i][2]);
        }
    }

    public void Print2DIntArray(int[][] array){
        for (int[] i: array) {
            for (int j: i){
                System.out.printf("%s ", j);
            }
            System.out.println();
        }
        System.out.println("\n-----------------\n");
    }

    public void Task2(){
        //a)

        int[][] a = new int[3][5];

        Print2DIntArray(a);

        //b)

        for (int i = 0; i < a.length; i++){
            a[i][i] = 1;
        }

        Print2DIntArray(a);

        //c)

        a = new int[3][5];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = j;
            }
        }

        Print2DIntArray(a);

        //d)

        a = new int[3][5];

        for (int i = 0; i < a.length; i++){
            Arrays.fill(a[i], i);
        }

        Print2DIntArray(a);

        //e)

        a = new int[3][5];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = j + i;
            }
        }

        Print2DIntArray(a);
    }
    public void Task3(){
        int[][] a = {
                {Subject.Mathemathik.ordinal(), Subject.Mathemathik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal()},
                {Subject.Englisch.ordinal(), Subject.Englisch.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Religion.ordinal(), Subject.Religion.ordinal(), Subject.Deutsch.ordinal(), Subject.Deutsch.ordinal()},
                {Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Mathemathik.ordinal(), Subject.Mathemathik.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.None.ordinal(), Subject.None.ordinal()},
                {Subject.Deutsch.ordinal(), Subject.Deutsch.ordinal(), Subject.Informatik.ordinal(), Subject.Informatik.ordinal(), Subject.Politik.ordinal(), Subject.Politik.ordinal(), Subject.None.ordinal(), Subject.None.ordinal()},
                {Subject.None.ordinal(), Subject.None.ordinal(), Subject.Physik.ordinal(), Subject.Physik.ordinal(), Subject.Englisch.ordinal(), Subject.Englisch.ordinal(), Subject.Förderunterricht.ordinal(), Subject.Förderunterricht.ordinal()},
        };
        Stundenplan stundenplan = new Stundenplan(a);
        stundenplan.Print();

        while(true){
            System.out.println("\n----------------\nBefehle:\n1. Stundenplan ausgeben.\n2. Stunde eintragen.\n3. Programm beenden.\n----------------\nWas möchtest du machen? (1-3)");
            int Input = Integer.parseInt(scanner.nextLine());
            switch (Input){
                case 1:
                    stundenplan.Print();
                    break;
                case 2:
                    stundenplan.Edit();
                    stundenplan.Print();
                    break;
                case 3:
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
}
