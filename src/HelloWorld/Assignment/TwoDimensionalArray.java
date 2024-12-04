package HelloWorld.Assignment;

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
                case 4:
                    Task4();
                    break;
                case 5:
                    Task5();
                    break;
                case 6:
                    Task6();
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
        int[][] chessboard = {
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
                {0,0, 0, 0, 0, 0, 0, 0},
        };

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
    public void Task2(){
        int[][] a = new int[3][5];

        for (int[] i: a) {
            for (int j: i){
                System.out.printf("%s ", j);
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++){
            a[i][i] = 1;
        }

        //todo - continue task
    }
    public void Task3(){

    }
    public void Task4(){

    }
    public void Task5(){

    }
    public void Task6(){

    }
}
