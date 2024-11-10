package HelloWorld.Assignment;

import HelloWorld.Data.QuizElement;

import java.util.List;
import java.util.Scanner;

public class doWhile {
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
        double conversionRate = 1.07;
        boolean repeat = true;
        do{
            System.out.print("Geben Sie den Betrag in Euro ein: ");
            double Input = Double.parseDouble((scanner.next()).replace(',', '.'));
            System.out.printf("Das sind %.2f Dollar.\n", Input * conversionRate);
            System.out.printf("Möchten Sie eine weitere Umrechnung durchführen? [ja/nein]: (ja) ");
            repeat = !scanner.next().equalsIgnoreCase("nein");
        } while(repeat);
    }
    public void Task2(){
        System.out.print("Zielbetrag zum Sparen: ");
        double Goal = Double.parseDouble((scanner.next()).replace(',', '.'));
        double Current = 0;
        boolean repeat = true;
        do{
            System.out.print("Wie viel haben Sie diesen Monat gespart? ");
            double Input = Double.parseDouble((scanner.next()).replace(',', '.'));
            Current += Input;
            System.out.printf("Ihr aktuelles Ersparnis beträgt: %.2f€\n", Current);
            if (Current < Goal){
                System.out.printf("Möchten Sie mehr sparen? [ja/nein]: (ja) ");
                repeat = !scanner.next().equalsIgnoreCase("nein");
            } else{
                repeat = false;
            }
        } while(repeat);
        System.out.printf("Ziel %serreicht! Sie haben %.2f€ gespart.", Current >= Goal ? "" : "nicht ", Current);
    }
    public void Task3(){
        QuizElement[] quizElements = new QuizElement[]
                {
                        new QuizElement("Was ist die Hauptstadt von Frankreich?", new String[]{"Berlin", "Paris", "Rom", "Madrid"}, 2),
                        new QuizElement("Was ist 5 * 5?", new String[]{"10", "20", "25", "30"}, 3),
                        new QuizElement("Was ist 15 + 20 / 4?", new String[]{"35", "25", "8,75", "20"}, 4),
                };
        boolean repeat = true;
        do{
            int quizIndex = (int)(Math.random() * quizElements.length);

            System.out.printf("Frage: %s\n", quizElements[quizIndex].Question);

            for (int i = 0; i < quizElements[quizIndex].Answers.length; i++){
                System.out.printf("%s) %s\n", i+1, quizElements[quizIndex].Answers[i]);
            }

            System.out.print("Antwort: ");
            int Input = Integer.parseInt((scanner.next()));
            System.out.printf("%s!\n", quizElements[quizIndex].CheckAnswer(Input) ? "Richtig" : "Falsch");

            System.out.print("Möchten Sie eine weitere Frage beantworten? [ja/nein]: (ja) ");
            repeat = !scanner.next().equalsIgnoreCase("nein");
        } while(repeat);
    }
}
