package HelloWorld.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class maximum {
    private final Scanner scanner = new Scanner(System.in);
    public void Run(){
        try{
            ArrayList<Long> Inputs = new ArrayList<>();

            System.out.print("Bitte gebe eine kette an zahlen ein: ");
            String[] splitInput = scanner.next().split(",");
            for (String s : splitInput) {
                Inputs.add(Long.parseLong(s));
            }

            for (int i = 0; i < Inputs.size() - 1; i++){
                for (int j = 0; j < Inputs.size() - i - 1; j++)
                   if (Inputs.get(j) < Inputs.get(j + 1)) {
                        long temp = Inputs.get(j);
                         Inputs.set(j, Inputs.get(j + 1));
                         Inputs.set(j + 1, temp);
                    }
             }

            System.out.printf("\nMaximum: %s\n", Inputs.get(0));

        } catch (Exception e){
            System.out.println("You did something wrong. Try again.\n");
            Run();
        }
    }
}
