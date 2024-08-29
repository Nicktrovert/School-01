package HelloWorld.Other;

import HelloWorld.Tools.CMath;

import java.util.Scanner;

public class Calculator {
    public static Scanner scanner = new Scanner(System.in);
    public void Run(){
        System.out.print("Enter a math expression: ");
        String UInput = scanner.nextLine();
        System.out.printf("%s = %s", UInput, CMath.eval(UInput));
    }
}
