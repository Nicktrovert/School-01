package HelloWorld.Assignment;

import java.util.*;

public class Brief {
    public Scanner scanner = new Scanner(System.in);

    final private Map<Integer, Double> PortoMapping = new HashMap<>(){{
            put(20, 1.00); put(50, 1.70);
            put(100, 2.40); put(250, 3.20);
            put(500, 4.00); put(1000, 4.80);
    }};

    //V.2 --- With stream filter:

    public void Run(){
        try {
            //get weight of the letter
            System.out.print("Bitte gib das Gewicht des Briefes in gramm an: ");
            double LetterWeight = Double.parseDouble(scanner.next().replace(',', '.'));

            //check that letter isn't a pakage
            if (LetterWeight < 1000){
                //get next highest Porto value above the letter weight and print the cost
                double cost = PortoMapping.get(PortoMapping.keySet().stream().filter(x -> x != null && x > LetterWeight).min(Integer::compareTo).get());
                System.out.printf("\nKosten: %.02f Euro\n", cost);
            } else{
                //notify the user that the weight exceeds the limits of a letter
                System.out.println("\nSchwerer als 1 kg, wird als Paket verschickt. (Bitte Paket-Porto berechner nutzen)");
            }
        } catch (Exception e){
            //Repeat everything if something goes wrong
            System.out.println("You did something wrong. Try again!\n");
            Run();
        }
    }

    /*V.1 --- With if/else:

    public void Run(){
        try {
            //get weight of the letter
            System.out.print("Bitte gib das Gewicht des Briefes in gramm an: ");
            double LetterWeight = Double.parseDouble(scanner.next().replace(',', '.'));

            //check that letter isn't a pakage
            if (LetterWeight < 1000){
                //get next highest Porto value above the letter weight and print the cost
                double cost = GetPortoMapping(LetterWeight);
                System.out.printf("\nKosten: %.02f Euro\n", cost);
            } else{
                //notify the user that the weight exceeds the limits of a letter
                System.out.println("\nSchwerer als 1 kg, wird als Paket verschickt. (Bitte Paket-Porto berechner nutzen)");
            }
        } catch (Exception e){
            //Repeat everything if something goes wrong
            System.out.println("You did something wrong. Try again!\n");
            Run();
        }
    }

    private double GetPortoMapping(double Weight){
        if (Weight < 20)
            return 1.00;
        else if (Weight < 50)
            return 1.70;
        else if (Weight < 100)
            return 2.40;
        else if (Weight < 250)
            return 3.20;
        else if (Weight < 500)
            return 4.00;
        else
            return 4.80;
    } */
}
