package HelloWorld.Data.Stundenplan;

import java.util.Scanner;

public class Stundenplan {
    public int[][] SubjectData;

    public Stundenplan(int[][] _SubjectData){
        SubjectData = _SubjectData;
    }

    public void Print(){
        for (int i = 0; i < 5; i++){
            System.out.printf("%s\t", Weekday.fromInteger(i).toString().substring(0, 2));
        }
        System.out.println("\n------------------");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < SubjectData.length; j++){
                if (i >= SubjectData[j].length){
                    System.out.print("  \t");
                    continue;
                }
                if (SubjectData[j][i] == Subject.values().length-1){
                    System.out.print("--\t");
                    continue;
                }

                System.out.printf("%s\t", Subject.fromInteger(SubjectData[j][i]).toString().substring(0, 2));
            }
            System.out.println();
        }
    }

    public void Edit(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Tage 1=%s 2=%s 3=%s 4=%s oder 5=%s\nStunden 1 - 10\nWelche Stunde soll eingetragen werden?\nTag: ", Weekday.fromInteger(1), Weekday.fromInteger(2), Weekday.fromInteger(3), Weekday.fromInteger(4), Weekday.fromInteger(5));
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Stunde: ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.print("Fach: ");
        Subject subject = Subject.fromString(scanner.nextLine());

        SubjectData[day-1][hour-1] = subject.ordinal();
    }
}
